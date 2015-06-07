package compiler;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.BoolContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Equal_ruleContext;
import aula3.LHCParser.GreaterE_ruleContext;
import aula3.LHCParser.Greater_ruleContext;
import aula3.LHCParser.LessE_ruleContext;
import aula3.LHCParser.Less_ruleContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.NEqual__ruleContext;
import aula3.LHCParser.Num_ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.Times_ruleContext;

public class MyVisitor extends LHCBaseVisitor<String> {
	int label=0;
	public String visitPrint(PrintContext ctx) {
		String child = visit(ctx.argument);
		String retorno = "getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n"
				+ child + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V";
		return retorno;
	}
	//EXP_BEGIN
	@Override
	public String visitOr_rule(Or_ruleContext ctx) {
		String retorno = visitChildren(ctx) + "\n" + "ior";
		return retorno;
	}
	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		String retorno = visitChildren(ctx) + "\n" + "iand";
		return retorno;
		
	}
	@Override
	public String visitEqual_rule(Equal_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmpeq Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitNEqual__rule(NEqual__ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmpne Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitLess_rule(Less_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmplt Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitGreater_rule(Greater_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmpgt Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitLessE_rule(LessE_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmple Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitGreaterE_rule(GreaterE_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child+"\n"+
				"if_icmpge Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
		return retorno;
	}
	@Override
	public String visitTimes_rule(Times_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" 
				+ "imul";
		return retorno;
	}
	@Override
	public String visitDivide_rule(Divide_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" 
				+ "idiv";
		return retorno;
	}

	@Override
	public String visitPlus_rule(Plus_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" 
				+ "iadd";
		return retorno;
	}

	@Override
	public String visitMinus_rule(Minus_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" 
				+ "isub";
		return retorno;
	}
	
	@Override
	public String visitNum_rule(Num_ruleContext ctx) {
		String retorno = "ldc " + ctx.Num().getText();
		return retorno;
	}
	@Override
	public String visitBool(BoolContext ctx) {
		String retorno = "ldc 0";
		if (ctx.getText().equals("true"))
			retorno =  "ldc 1";
		return retorno;
	}
	//EXP_END
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
}
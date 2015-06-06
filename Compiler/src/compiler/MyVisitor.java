package compiler;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.BoolContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.Num_ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.Times_ruleContext;

public class MyVisitor extends LHCBaseVisitor<String> {

	@Override
	public String visitPrint(PrintContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n"
				+ visit(ctx.argument) + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V";
	}
	
	@Override
	public String visitNum_rule(Num_ruleContext ctx) {
		return "ldc " + ctx.Num().getText();
	}

	@Override
	public String visitPlus_rule(Plus_ruleContext ctx) {
		return visitChildren(ctx) + "\n" 
				+ "iadd";
	}

	@Override
	public String visitMinus_rule(Minus_ruleContext ctx) {
		return visitChildren(ctx) + "\n" 
				+ "isub";
	}

	@Override
	public String visitTimes_rule(Times_ruleContext ctx) {
		return visitChildren(ctx) + "\n" 
				+ "imul";
	}

	@Override
	public String visitDivide_rule(Divide_ruleContext ctx) {
		return visitChildren(ctx) + "\n" 
				+ "idiv";
	}

	@Override
	public String visitOr_rule(Or_ruleContext ctx) {
		return visitChildren(ctx) + "\n" + "ior";
		// return visitChildren(ctx) + "\n" +
		// ctx.right.getText() + "\n"+
		// "OR";

		// visitChildren(ctx);
		// System.out.println(ctx.r_Or.getText());
		// System.out.println("OR");
		// return null;
	}

	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		String r = "ldc 0";
		if (ctx.right.getText().equals("true"))
			r = "ldc 1";
		return visitChildren(ctx) + "\n" + r + "\n" + "iand";
		// return visitChildren(ctx) + "\n" +
		// ctx.right.getText() + "\n"+
		// "AND";
	}

	@Override
	public String visitBool(BoolContext ctx) {
		if (ctx.bool.getText().equals("true"))
			return "ldc 1";
		return "ldc 0";
		// System.out.println(ctx.bool.getText());
		// return null;
	}

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
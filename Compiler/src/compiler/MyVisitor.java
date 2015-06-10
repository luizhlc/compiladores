package compiler;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.AssignmentContext;
import aula3.LHCParser.BoolContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Equal_ruleContext;
import aula3.LHCParser.GreaterE_ruleContext;
import aula3.LHCParser.Greater_ruleContext;
import aula3.LHCParser.LessE_ruleContext;
import aula3.LHCParser.Less_ruleContext;
import aula3.LHCParser.MethodCallContext;
import aula3.LHCParser.MethodDefContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.NEqual__ruleContext;
import aula3.LHCParser.Num_ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.Times_ruleContext;
import aula3.LHCParser.VarDeclContext;
import aula3.LHCParser.VarMultDeclContext;
import aula3.LHCParser.VariableContext;

public class MyVisitor extends LHCBaseVisitor<String> {

	int label = 0;

	private HashMap<String, Integer> variables = new HashMap<>();
	private HashMap<String, Type> types = new HashMap<>();

	@Override
	public String visitMethodCall(MethodCallContext ctx) {
		return "invokestatic JCode/" + ctx.funcName1.getText();
	}

	@Override
	public String visitMethodDef(MethodDefContext ctx) {
		String return_ = "";
		
		if(ctx.stmtList != null){
			return_ = visitStmt(ctx.stmtList) + "\n";
		}
		
		if(ctx.returnExp != null ){
			return_ = visit(ctx.returnExp) + "\n";
			if(ctx.typeVoid != null)
				try {
					throw new Exception("line:" + ctx.typeVoid.getLine() + " Seriously? Trying to return a value in a void method? I don't get paid for that");
				} catch (Exception e) {
					e.printStackTrace();
				}
		}else if(ctx.returnID != null){
			return_ = visit((ParseTree) ctx.returnID) + "\n";
			try {
				throw new Exception("line:" + ctx.typeVoid.getLine() + " Seriously? Trying to return a value in a void method? I don't get paid for that");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return  ".method public static main([Ljava/lang/String;)V\n" +
				".limit locals 100\n" + 
				".limit stack\n" + 
				return_ +
				"ireturn\n" + 
				".end method";
	}

	@Override
	public String visitVarDecl(VarDeclContext ctx) {
		if (variables.get(ctx.varName.getText()) == null) {
			variables.put(ctx.varName.getText(), variables.size());
			storeType(ctx.type_.getText(), ctx.varName.getText());
		} else {
			try {
				throw new Exception("line:" + ctx.varName.getLine() + " '"
						+ ctx.varName.getText()
						+ "' has already been declared, genius.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	@Override
	public String visitVarMultDecl(VarMultDeclContext ctx) {
		List<TerminalNode> l = ctx.ID();
		for (TerminalNode terminalNode : l) {
			String varName = terminalNode.getText();

			if (variables.get(varName) == null) {
				variables.put(varName, variables.size());
				storeType(ctx.type_.getText(), ctx.varName.getText());
			} else {
				try {
					throw new Exception("line:" + ctx.varName.getLine() + " '"
							+ ctx.varName.getText()
							+ "' has already been declared, genius.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}

	@Override
	public String visitAssignment(AssignmentContext ctx) {
		if (ctx.type_ != null) {
			variables.put(ctx.varName.getText(), variables.size());
			storeType(ctx.type_.getText(), ctx.varName.getText());
		} else if (ctx.type_ == null
				&& variables.get(ctx.varName.getText()) == null) {
			try {
				throw new Exception("line:" + ctx.varName.getLine()
						+ " You must declare your variable '"
						+ ctx.varName.getText() + "' before using it, genius.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return visit(ctx.rightSide_) + "\n" + "istore "
				+ variables.get(ctx.varName.getText());
	}

	public String visitPrint(PrintContext ctx) {
		String child = visit(ctx.argument);
		String retorno = "getstatic java/lang/System/out Ljava/io/PrintStream;"
				+ "\n" + child + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V";
		return retorno;
	}

	@Override
	public String visitVariable(VariableContext ctx) {
		return "iload " + variables.get(ctx.varName.getText());
	}

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
		String retorno = child + "\n" + "if_icmpeq Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitNEqual__rule(NEqual__ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "if_icmpne Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitLess_rule(Less_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "if_icmplt Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitGreater_rule(Greater_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "if_icmpgt Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitLessE_rule(LessE_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "if_icmple Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitGreaterE_rule(GreaterE_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "if_icmpge Label" + label + "\n"
				+ "ldc 0" + "\n" + "goto Exit" + label + "\n" + "Label" + label
				+ ":" + "\n" + "ldc 1" + "\n" + "Exit" + label++ + ":";
		return retorno;
	}

	@Override
	public String visitTimes_rule(Times_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "imul";
		return retorno;
	}

	@Override
	public String visitDivide_rule(Divide_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "idiv";
		return retorno;
	}

	@Override
	public String visitPlus_rule(Plus_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "iadd";
		return retorno;
	}

	@Override
	public String visitMinus_rule(Minus_ruleContext ctx) {
		String child = visitChildren(ctx);
		String retorno = child + "\n" + "isub";
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
			retorno = "ldc 1";
		return retorno;
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

	private void storeType(String type, String varName) {
		switch (type) {
		case "int":
			types.put(varName, Type.Integer);
			break;
		case "double":
			types.put(varName, Type.Double);
			break;
		case "string":
			types.put(varName, Type.String);
			break;
		default:
			break;
		}
	}
}
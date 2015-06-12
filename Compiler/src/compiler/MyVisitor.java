package compiler;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.AssignmentContext;
import aula3.LHCParser.Bool_ruleContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Equal_ruleContext;
import aula3.LHCParser.GreaterE_ruleContext;
import aula3.LHCParser.Greater_ruleContext;
import aula3.LHCParser.Int_ruleContext;
import aula3.LHCParser.LessE_ruleContext;
import aula3.LHCParser.Less_ruleContext;
import aula3.LHCParser.MethodCallContext;
import aula3.LHCParser.MethodDefContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.NEqual__ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.StmtContext;
import aula3.LHCParser.Times_ruleContext;
import aula3.LHCParser.Value_ruleContext;
import aula3.LHCParser.VarDeclContext;
import aula3.LHCParser.VarMultDeclContext;
import aula3.LHCParser.VariableContext;

public class MyVisitor extends LHCBaseVisitor<String> {

	int label = 0;

	Stack<Type> type_st = new Stack<Type>();
	
	private HashMap<String, Integer> variables = new HashMap<>();
	private HashMap<String, Type> types = new HashMap<>();
	
	private HashMap<String, Type> methods = new HashMap<>();
	
	private boolean hasMainMethod = false;
	
	public boolean hasMainMethod(){
		return hasMainMethod;
	}

	@Override
	public String visitMethodCall(MethodCallContext ctx) {
		return "invokestatic "+Main.ProgramName+"/" + ctx.funcName1.getText() + "()" + methods.get(ctx.funcName1.getText()).getTypeParameter();
	}
	
	@Override
	public String visitStmt(StmtContext ctx) {
		return super.visitStmt(ctx);
	}
	
	private Type formatTypeName(MethodDefContext ctx){
		if(ctx.typeVoid != null)
			return Type.valueOf(ctx.typeVoid.getText().substring(0,1).toUpperCase() + ctx.typeVoid.getText().substring(1));
		return Type.valueOf(ctx.type_.getText().substring(0,1).toUpperCase() + ctx.type_.getText().substring(1));
	}

	@Override
	public String visitMethodDef(MethodDefContext ctx) {
		String return_ = "";
		
		String instructions = "";
		if(ctx.stmtList != null){
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree child = ctx.getChild(i);
				if(child instanceof StmtContext)
					instructions += visit(child) + "\n";
			}
			return_ += instructions;
		}
		
		methods.put(ctx.funcName.getText(), formatTypeName(ctx));
		
			
		if(ctx.returnExp != null ){
			return_ = visit(ctx.returnExp) + "\n";
			if(ctx.typeVoid != null){
				try {
					throw new Exception("line:" + ctx.typeVoid.getLine() + " Seriously? Trying to return a value in a void method? I don't get paid for that");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}else if(ctx.returnID != null){
			return_ = visit((ParseTree) ctx.returnID) + "\n";
			try {
				throw new Exception("line:" + ctx.typeVoid.getLine() + " Seriously? Trying to return a value in a void method? I don't get paid for that");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//temporary gambiarra
		if(ctx.funcName.getText().equals("main")){
			if(hasMainMethod){
				try {
					throw new Exception("Another main method? You have no idea what you're doing, do you?");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else
				hasMainMethod = true;
			return  ".method public static "+ctx.funcName.getText()+"([Ljava/lang/String;)V\n" +
			".limit locals 100\n" + 
			".limit stack 100\n" + 
			return_ +
			"return\n" + 
			".end method";	
		}
		
		Type type = this.formatTypeName(ctx);
		return  ".method public static "+ctx.funcName.getText()+"()"+type.getTypeParameter()+"\n" +
				".limit locals 100\n" + 
				".limit stack 100\n" + 
				return_ +
				type.getTypePrefix()+"return\n" + 
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
		String child = visit(ctx.rightSide_);
		Type var = types.get(ctx.varName.getText());
		typeVerify_att(var);
		if(type_st.peek()==Type.Double){
			return  child+ "\n" +
					"dstore " + variables.get(ctx.varName.getText());
		}
		return visit(ctx.rightSide_) + "\n" + "istore "
				+ variables.get(ctx.varName.getText());
	}

	public String visitPrint(PrintContext ctx) {
		String child = visit(ctx.argument);
		if(type_st.peek()==Type.Double){
			return "getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n"
					+ child + "\n"
					+ "invokevirtual java/io/PrintStream/println(D)V";
		}
		return "getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n"
				+ child + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V";
	}

	@Override
	public String visitVariable(VariableContext ctx) {
		type_st.push(types.get(ctx.varName.getText()));
		if(type_st.peek()==Type.Double){
			return "dload " + variables.get(ctx.varName.getText());
		}
		return "iload " + variables.get(ctx.varName.getText());
	}

	@Override
	public String visitOr_rule(Or_ruleContext ctx) {
		typeVerify_logic();
		return visitChildren(ctx) + "\n" + "ior";
	}

	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		typeVerify_logic();
		return visitChildren(ctx) + "\n" + "iand";
	}

	@Override
	public String visitEqual_rule(Equal_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_equality();
		if(type_st.pop()==Type.Double){

			return child+"\n"+
				   "dcmpg" +"\n"
				   + "ifeq Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmpeq Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
	}

	@Override
	public String visitNEqual__rule(NEqual__ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_equality();
		if(type_st.pop()==Type.Double){

			return child+"\n"+
				   "dcmpg" +"\n"
				   + "ifne Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmpne Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
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
		typeVerify_comparison();
		if(type_st.pop()==Type.Double){

			return child+"\n"+
				   "dcmpg" +"\n"
				   + "ifle Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmple Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
	}
	
	@Override
	public String visitGreaterE_rule(GreaterE_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_comparison();
		if(type_st.pop()==Type.Double){

			return child+"\n"+
				   "dcmpg" +"\n"
				   + "ifge Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmpge Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
	}
	
	@Override
	public String visitDivide_rule(Divide_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_Div();
		if(type_st.peek()==Type.Double){
			return child + "\n" 
					+ "ddiv";
		}
		return child + "\n" 
				+ "idiv";
	}

	@Override
	public String visitTimes_rule(Times_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_simpleAritm();
		if(type_st.peek()==Type.Double){
			return child + "\n" 
					+ "dmul";
		}
		return child + "\n" 
				+ "imul";
	}
	
	@Override
	public String visitPlus_rule(Plus_ruleContext ctx) {
		
		String child = visitChildren(ctx);
		typeVerify_simpleAritm();	
		if(type_st.peek()==Type.Double){
			return child + "\n" 
					+ "dadd";
		}
		return child + "\n" 
				+ "iadd";
	}

	@Override
	public String visitMinus_rule(Minus_ruleContext ctx) {
		
		String child = visitChildren(ctx);
		typeVerify_simpleAritm();
		if(type_st.peek()==Type.Double){
			return child + "\n" 
					+ "dsub";
		}
		return child + "\n" 
				+ "isub";
	}

	@Override
	public String visitInt_rule(Int_ruleContext ctx) {
		type_st.push(Type.Int);
		return "ldc " + ctx.value_.getText();
	}
	
	@Override
	public String visitBool_rule(Bool_ruleContext ctx) {
		type_st.push(Type.Bool);
		if (ctx.getText().equals("true"))
			return "ldc 1";
		return "ldc 0";
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
			types.put(varName, Type.Int);
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
	
	
	//Verificacao de tipos
	private void typeVerify_simpleAritm(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		if(a==Type.Int && b==a){
			type_st.push(Type.Int);
			return;
		}
		//if(a==Type.Double&&b==a || a==Type.Integer&&b==Type.Double || (a==Type.Double&&b==Type.Integer)){
		if(a==Type.Double&&b==a){
			type_st.push(Type.Double);
			return;
		}
		try {
			throw new Exception("line:" +1 + "You can't operate with types "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void typeVerify_Div(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		//if(a==Type.Double&&b==a || a==Type.Integer&&b==Type.Double || a==Type.Double&&b==Type.Integer || a==Type.Integer && b==a){
		if( a==Type.Int && b==a){
			type_st.push(Type.Int);
			return;
		}
		if(a==Type.Double&&b==a ){
			type_st.push(Type.Double);
			return;
		}
		try {
			throw new Exception("line:" +1 + "You can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_comparison(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		//if(a==Type.Double&&b==a || a==Type.Integer&&b==Type.Double || a==Type.Double&&b==Type.Integer || a==Type.Integer && b==a){
		if(a==Type.Double&&b==a||a==Type.Int && b==a){
			type_st.push(Type.Bool);
			type_st.push(a);
			return;
		}
		try {
			throw new Exception("line:" +1 + "You can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_equality(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		//if(a==Type.Double&&b==Type.Double || a==Type.Integer&&b==a || a==Type.Boolean&&a==b){
		if(a==Type.Double&&b==a || a==Type.Int&&b==a || a==Type.Bool&&a==b){
			type_st.push(Type.Bool);
			type_st.push(a);
			return;
		}
		try {
			throw new Exception("line:" +1 + "You can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_logic(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		if(a==Type.Bool&&b==a){
			type_st.push(Type.Bool);
			return;
		}
		try {
			throw new Exception("line:" +1 + "You can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_att(Type var){
		Type a = type_st.pop();
		type_st.push(var);
		if(var==a){
			return;
		}
		
		try {
			throw new Exception("line:" +1 + "You can't attribute a "+a+" type to variable of "+var+" type, genius.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
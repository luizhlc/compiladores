package compiler;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.AssignmentContext;
import aula3.LHCParser.BoolContext;
import aula3.LHCParser.CleanContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Equal_ruleContext;
import aula3.LHCParser.GreaterE_ruleContext;
import aula3.LHCParser.Greater_ruleContext;
import aula3.LHCParser.Integer_Context;
import aula3.LHCParser.LessE_ruleContext;
import aula3.LHCParser.Less_ruleContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.NEqual__ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.Real_Context;
import aula3.LHCParser.Times_ruleContext;
import aula3.LHCParser.VarDeclContext;
import aula3.LHCParser.VarMultDeclContext;
import aula3.LHCParser.VariableContext;

public class MyVisitor extends LHCBaseVisitor<String> {
	
	int label=0;
	Stack<Type> type_st = new Stack<Type>();
	private HashMap<String, Integer> variables = new HashMap<>();
	private HashMap<String, Type> types = new HashMap<>();
	
	@Override
	public String visitVarDecl(VarDeclContext ctx) {
		if(variables.get(ctx.varName.getText()) == null){
			variables.put(ctx.varName.getText(), variables.size());
			storeType(ctx.type_.getText(), ctx.varName.getText());
		}else{
			try {
				throw new Exception("line:" + ctx.varName.getLine() + " '" + ctx.varName.getText() + "' has already been declared, genius.");
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
			
			if(variables.get(varName) == null){
				variables.put(varName, variables.size());
				storeType(ctx.type_.getText(), ctx.varName.getText());
			}else{
				try {
					throw new Exception("line:" + ctx.varName.getLine() + " '" + ctx.varName.getText() + "' has already been declared, genius.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}
	
	@Override
	public String visitAssignment(AssignmentContext ctx) {
		if(ctx.type_ != null){
			variables.put(ctx.varName.getText(), variables.size());
			storeType(ctx.type_.getText(), ctx.varName.getText());
		}else if(ctx.type_ == null && variables.get(ctx.varName.getText()) == null){
			try {
				throw new Exception("line:" + ctx.varName.getLine() + " You must declare your variable '" + ctx.varName.getText() + "' before using it, genius.");
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
		return  child+ "\n" +
		"istore " + variables.get(ctx.varName.getText());	
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
	public String visitOr_rule(Or_ruleContext ctx) {
		String retorno = visitChildren(ctx) + "\n" + "ior";
		typeVerify_logic();
		return retorno;
	}
	
	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		String retorno = visitChildren(ctx) + "\n" + "iand";
		typeVerify_logic();
		return retorno;
		
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
		typeVerify_comparison();
		if(type_st.pop()==Type.Double){
			return child+"\n"+
				   "dcmpg" +"\n"
				   + "iflt Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmplt Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
	}
	
	@Override
	public String visitGreater_rule(Greater_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_comparison();
		if(type_st.pop()==Type.Double){

			return child+"\n"+
				   "dcmpg" +"\n"
				   + "ifgt Label"+label +"\n"
					+ "ldc 0" +"\n"
					+"goto Exit"+label+"\n"
					+"Label"+label+":"+"\n"
					+"ldc 1"+"\n"
					+"Exit"+label++ +":";
		}
		return child+"\n"+
				"if_icmpgt Label"+label +"\n"
				+ "ldc 0" +"\n"
				+"goto Exit"+label+"\n"
				+"Label"+label+":"+"\n"
				+"ldc 1"+"\n"
				+"Exit"+label++ +":";
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
	public String visitVariable(VariableContext ctx) {
		type_st.push(types.get(ctx.varName.getText()));
		if(type_st.peek()==Type.Double){
			return "dload " + variables.get(ctx.varName.getText());
		}
		return "iload " + variables.get(ctx.varName.getText());
	}
	@Override
	public String visitReal_(Real_Context ctx) {
		type_st.push(Type.Double);
		String retorno = "ldc2_w " + ctx.getText();
		return retorno;
	}
	@Override
	public String visitInteger_(Integer_Context ctx) {
		type_st.push(Type.Integer);
		String retorno = "ldc " + ctx.getText();
		return retorno;
	}
	@Override
	public String visitBool(BoolContext ctx) {
		type_st.push(Type.Boolean);
		String retorno = "ldc 0";
		if (ctx.getText().equals("true"))
			retorno =  "ldc 1";
		return retorno;
	}

	@Override
	public String visitClean(CleanContext ctx) {
		type_st.clear();
		return visitChildren(ctx);
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
		case "bool":
			types.put(varName, Type.Boolean);
			break;
		case "char":
			types.put(varName, Type.Char);
			break;
		default:
			break;
		}
	}
	
	//Verificacao de tipos
	private void typeVerify_simpleAritm(){
		Type a = type_st.pop();
		Type b = type_st.pop();
		if(a==Type.Integer && b==a){
			type_st.push(Type.Integer);
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
		if( a==Type.Integer && b==a){
			type_st.push(Type.Integer);
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
		if(a==Type.Double&&b==a||a==Type.Integer && b==a){
			type_st.push(Type.Boolean);
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
		if(a==Type.Double&&b==a || a==Type.Integer&&b==a || a==Type.Boolean&&a==b){
			type_st.push(Type.Boolean);
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
		if(a==Type.Boolean&&b==a){
			type_st.push(Type.Boolean);
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
			throw new Exception("line:" +1 + "You can't attribute a "+a+" type to variable of "+var+" type, genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
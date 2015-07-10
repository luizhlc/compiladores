package compiler;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.AssignmentContext;
import aula3.LHCParser.Bool_ruleContext;
import aula3.LHCParser.Case_ruleContext;
import aula3.LHCParser.Default_ruleContext;
import aula3.LHCParser.Divide_ruleContext;
import aula3.LHCParser.Double_ruleContext;
import aula3.LHCParser.Equal_ruleContext;
import aula3.LHCParser.GreaterE_ruleContext;
import aula3.LHCParser.Greater_ruleContext;
import aula3.LHCParser.Int_ruleContext;
import aula3.LHCParser.LessE_ruleContext;
import aula3.LHCParser.Less_ruleContext;
import aula3.LHCParser.LoopContext;
import aula3.LHCParser.MethodCallContext;
import aula3.LHCParser.MethodDefContext;
import aula3.LHCParser.Minus_ruleContext;
import aula3.LHCParser.NEqual__ruleContext;
import aula3.LHCParser.Or_ruleContext;
import aula3.LHCParser.ParamDeclContext;
import aula3.LHCParser.Plus_ruleContext;
import aula3.LHCParser.PrintContext;
import aula3.LHCParser.ProgramContext;
import aula3.LHCParser.StmtContext;
import aula3.LHCParser.Times_ruleContext;
import aula3.LHCParser.VarDeclContext;
import aula3.LHCParser.VarMultDeclContext;
import aula3.LHCParser.VariableContext;

public class MyVisitor extends LHCBaseVisitor<String> {

	int label = 0;
	int exitLabel=0;
	int elseLabel=0;
	Stack<Type> type_st = new Stack<Type>();
	
	private HashMap<String, Integer> variables = new HashMap<>();
	private HashMap<String, Type> types = new HashMap<>();
	
	private HashMap<String, Type> methods = new HashMap<>();
	private HashMap<String, Vector<Type>> methods_par = new HashMap<>();
	
	@Override
	public String visitProgram(ProgramContext ctx){
		String child = visitChildren(ctx);
		if(!methods.containsKey("main")){
			try {
				throw new Exception("No main method... Are you sure you've picked up the right course?");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return child;
		
	}
	
	@Override
	public String visitStmt(StmtContext ctx) {
		type_st.clear();
		return super.visitStmt(ctx);
	}
	
	@Override
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
	public String visitLoop(LoopContext ctx) {
		return "";
	}
	
	@Override
	public String visitMethodDef(MethodDefContext ctx) {
		HashMap<String, Integer> oldVariables = variables;
		variables = new HashMap<>();
		String return_ = "";
		if(ctx.params!=null){
			visit(ctx.params);
		}
		type_st.clear();
		String instructions = "";
		String retorno;
		//verifica se a funcao foi declarada
		if(!methods.containsKey(ctx.funcName.getText())){
			methods.put(ctx.funcName.getText(), formatTypeName(ctx));
		}
		else{
			try {
				throw new Exception("Line: +"+ctx.start.getLine()+"\nAnother "+ctx.funcName.getText()+"  method? You have no idea what you're doing, do you?");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(ctx.funcName.getText().equals("main")){
			retorno=  ".method public static "+ctx.funcName.getText()+"([Ljava/lang/String;)V\n" +
					".limit locals 100\n" + 
					".limit stack 100\n";
		}
		else{
			Vector<Type> parametros = new Vector<Type>();
			Type type = this.formatTypeName(ctx);
			String assinatura=".method public static "+ctx.funcName.getText()+"(" ;
			if(ctx.params!= null){
				for (int i = 0; i < ctx.params.getChildCount(); i++) {
					ParseTree child = ctx.params.getChild(i);
					if(child instanceof ParamDeclContext){
						assinatura += checkType(child.getChild(0).getText()).getTypeParameter() + "";
						parametros.add(checkType(child.getChild(0).getText()));
					}
				}
			}
			methods_par.put(ctx.funcName.getText(),parametros);
		
		retorno = assinatura+")"+type.getTypeParameter()+"\n" +
				".limit locals 100\n" + 
				".limit stack 100\n";
		}
		
		
		
		//visita stmt
		if(ctx.stmtList != null){
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree child = ctx.getChild(i);
				if(child instanceof StmtContext)
					instructions += visit(child) + "\n";
			}
			return_ += instructions;
		}
		
		//verifica retorno
		if(ctx.returnExp != null ){
			if(ctx.typeVoid != null){
				try {
					throw new Exception("line:" + ctx.typeVoid.getLine() + "\nSeriously? Trying to return a value in a void method? I don't get paid for that");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(ctx.returnExp.getText().equals("void")){
				try {
					throw new Exception("line:" + ctx.type_.getStart().getLine() + "\n... you need to return something in a "+ctx.type_+" method.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//intrução de retorno
			return_ += visit(ctx.returnExp) + "\n";
			if(!ctx.type_.getText().equals(type_st.peek().getType())){
				try {
					throw new Exception("line:" + ctx.Return().getSymbol().getLine() + "\n"+type_st.peek().getType()+" return??? ... You need to return a "+ctx.type_.getText()+" in a "+ctx.type_.getText()+" method.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		//verifica se é main
		if(ctx.funcName.getText().equals("main")){
			retorno+= return_ +
					"return\n" + 
					".end method";		
		}
		else{	
				Type type = this.formatTypeName(ctx);
				retorno += return_ +
				type.getTypePrefix()+"return\n" + 
				".end method";
		}
		
		
		variables = oldVariables;
		return retorno;
	}
	@Override
	public String visitMethodCall(MethodCallContext ctx) {
		type_st.push(methods.get(ctx.funcName1.getText()));
		if(!methods.containsKey(ctx.funcName1.getText())){
			try {
				throw new Exception("Line: +"+ctx.start.getLine()+"\n Method "+ctx.funcName1.getText()+" undeclared");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "";
			
		}
		int num_par = ctx.argList.par.size();
	   
		String instructions = "";
		String argumentsInstructions = "";
		if(ctx.argList!=null){
			if(!methods_par.containsKey(ctx.funcName1.getText())){
				try {
					throw new Exception("Line: +"+ctx.start.getLine()+"\n ESSA FUNCAO NAO TEM PARAMETROS PORRA: 2h da manha");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			argumentsInstructions = visit(ctx.argList);
		}

		Vector<Type> parametros_func = methods_par.get(ctx.funcName1.getText());
		 if(num_par>parametros_func.size()){
			 try {
					throw new Exception("Line: +"+ctx.start.getLine()+"\n TEM PARAMETRO SOBRANDO AI PORRA");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		 }
		 if(num_par<parametros_func.size()){
			 try {
					throw new Exception("Line: +"+ctx.start.getLine()+"\n TEM PARAMETRO FALTANDO AI PORRA");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		 }
		instructions += argumentsInstructions + '\n';
		instructions += "invokestatic "+Main.ProgramName+"/" + ctx.funcName1.getText() + "(";
		StringBuilder parametros = new StringBuilder();
		while(num_par!=0){
			Type atual = type_st.pop();
			parametros.insert(0, atual.getTypeParameter() );
			if(parametros_func.get(num_par-1)!=atual){
				try {
					throw new Exception("Line: +"+ctx.start.getLine()+"\n VOCE NAO PODE PASSAR UM PARAMETRO "+atual.getType()+" SENDO QUE SE ESPERAVA UM "+parametros_func.get(num_par));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			num_par--;
		}
	    instructions+=parametros.toString()+")" + methods.get(ctx.funcName1.getText()).getTypeParameter();
		return instructions;
				
	}
	@Override
	public String visitParamDecl(ParamDeclContext ctx){
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
	public String visitCase_rule(Case_ruleContext ctx) {
		String instructions="";
		
		String condition ="";
		condition = visit(ctx.condition_);
		if(type_st.pop()!=Type.Bool){
			try {
				throw new Exception("Line: "+ctx.start.getLine()+"\nComo vou saber se essa expressao eh verdadeira se nao retorna bool?");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String return_ =condition+"\n";
		return_+="ifeq False"+elseLabel+"\n";
		if(ctx.stmtList != null){
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree child = ctx.getChild(i);
				if(child instanceof StmtContext)
					instructions += visit(child) + "\n";
			}
			return_ += instructions;
		}
		return_+= "goto ExitCase"+exitLabel+"\n";
		return_+="False"+elseLabel+++":\n";
		return return_;
	}

	@Override
	public String visitDefault_rule(Default_ruleContext ctx) {
		String instructions="";
		String return_="";
		if(ctx.stmtList != null){
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree child = ctx.getChild(i);
				if(child instanceof StmtContext)
					instructions += visit(child) + "\n";
			}
			return_ += instructions;
		}
		return_+= "ExitCase"+exitLabel+++":\n";
		return return_;
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
		if(variables.get(ctx.varName.getText()) != null && ctx.type_ != null){
			try {
				throw new Exception("line:" + ctx.varName.getLine() + " '"
						+ ctx.varName.getText()
						+ "' has already been declared, genius.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
		typeVerify_att(var,ctx.varName.getLine());
		if(type_st.peek()==Type.Double){
			return  child+ "\n" +
					"dstore " + variables.get(ctx.varName.getText());
		}
		return visit(ctx.rightSide_) + "\n" + "istore "
				+ variables.get(ctx.varName.getText());
	}

	@Override
	public String visitOr_rule(Or_ruleContext ctx) {
//		typeVerify_logic();
		return visitChildren(ctx) + "\n" + "ior";
	}
	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		typeVerify_logic(ctx.start.getLine());
		return visitChildren(ctx) + "\n" + "iand";
	}
	@Override
	public String visitEqual_rule(Equal_ruleContext ctx) {
		String child = visitChildren(ctx);
		typeVerify_equality(ctx.start.getLine());
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
		typeVerify_equality(ctx.start.getLine());
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
		typeVerify_comparison(ctx.start.getLine());
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
		typeVerify_comparison(ctx.start.getLine());
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
		typeVerify_Div(ctx.start.getLine());
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
		typeVerify_simpleAritm(ctx.start.getLine());
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
		typeVerify_simpleAritm(ctx.start.getLine());	
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
		typeVerify_simpleAritm(ctx.start.getLine());
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
	public String visitDouble_rule(Double_ruleContext ctx) {
		type_st.push(Type.Double);
		return "ldc2_w " + ctx.value_.getText();
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
	private Type checkType(String type) {
		switch (type) {
		case "int":
			return Type.Int;
		case "double":
			return Type.Double;
		default:
			return Type.String;
		}
	}
	private Type formatTypeName(MethodDefContext ctx){
		if(ctx.typeVoid != null)
			return Type.valueOf(ctx.typeVoid.getText().substring(0,1).toUpperCase() + ctx.typeVoid.getText().substring(1));
		return Type.valueOf(ctx.type_.getText().substring(0,1).toUpperCase() + ctx.type_.getText().substring(1));
	}
	
	//Verificacao de tipos
	private void typeVerify_simpleAritm(int l){
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
			type_st.push(Type.Double);
			throw new Exception("line:" +l + "You can't operate with types "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void typeVerify_Div(int l){
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
			type_st.push(Type.Double);
			throw new Exception("line:" +l + "You can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_comparison(int l){
		Type a = type_st.pop();
		Type b = type_st.pop();
		//if(a==Type.Double&&b==a || a==Type.Integer&&b==Type.Double || a==Type.Double&&b==Type.Integer || a==Type.Integer && b==a){
		if(a==Type.Double&&b==a||a==Type.Int && b==a){
			type_st.push(Type.Bool);
			type_st.push(a);
			return;
		}
		try {
			type_st.push(Type.Bool);
			type_st.push(a);
			throw new Exception("line: " +1 + "\nYou can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_equality(int l){
		Type a = type_st.pop();
		Type b = type_st.pop();
		//if(a==Type.Double&&b==Type.Double || a==Type.Integer&&b==a || a==Type.Boolean&&a==b){
		if(a==Type.Double&&b==a || a==Type.Int&&b==a || a==Type.Bool&&a==b){
			type_st.push(Type.Bool);
			type_st.push(a);
			return;
		}
		try {
			type_st.push(Type.Bool);
			type_st.push(a);
			throw new Exception("line: " +l + "\nYou can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_logic(int l){
		Type a = type_st.pop();
		Type b = type_st.pop();
		if(a==Type.Bool&&b==a){
			type_st.push(Type.Bool);
			return;
		}
		try {
			type_st.push(Type.Bool);
			throw new Exception("line: " +l + "\nYou can't operate with "+a+" and "+b+", genius.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void typeVerify_att(Type var, int l){
		Type a = type_st.pop();
		type_st.push(var);
		if(var==a){
			return;
		}
		
		try {
			type_st.push(var);
			throw new Exception("line: " +l + " \nYou can't attribute a "+a+" type to variable of "+var+" type, genius.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
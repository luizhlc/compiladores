package compiler;

import aula3.LHCBaseVisitor;
import aula3.LHCParser.And_ruleContext;
import aula3.LHCParser.BoolContext;
import aula3.LHCParser.NextAndContext;
import aula3.LHCParser.NextOrContext;
import aula3.LHCParser.Or_ruleContext;

public class MyVisitor extends LHCBaseVisitor<String>{
	
	@Override
	public String visitOr_rule(Or_ruleContext ctx) {
			return visitChildren(ctx) + "\n"+
			"ior";
//		return visitChildren(ctx) + "\n" +
//				ctx.right.getText() + "\n"+
//				"OR";	
		
//		visitChildren(ctx);
//		System.out.println(ctx.r_Or.getText());
//		System.out.println("OR");
//		return null;
	}
	@Override
	public String visitNextAnd(NextAndContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitNextOr(NextOrContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitAnd_rule(And_ruleContext ctx) {
		String r="ldc 0";
		if(ctx.right.getText().equals("true"))
			r= "ldc 1";
		return visitChildren(ctx) + "\n" +
		r+ "\n"+
		"iand";
//		return visitChildren(ctx) + "\n" +
//				ctx.right.getText() + "\n"+
//				"AND";
	}
	
	@Override
	public String visitBool(BoolContext ctx) {
		if(ctx.bool.getText().equals("true"))
			return "ldc 1";
		return "ldc 0";
//		System.out.println(ctx.bool.getText());
//		return null;
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if(aggregate == null){
			return nextResult;
		}
		if(nextResult == null){
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
}
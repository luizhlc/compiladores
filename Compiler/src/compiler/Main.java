package compiler;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import aula3.LHCLexer;
import aula3.LHCParser;

public class Main {

	public static void main(String[] args) throws Exception{
		ANTLRInputStream input = new ANTLRFileStream("code.lhc");
		LHCLexer lexer = new LHCLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		LHCParser parser = new LHCParser(token);
		
		ParseTree tree = parser.exp1();
		System.out.println(createJasminFile(new MyVisitor().visit(tree)));
		
	}

	private static String  createJasminFile(String instructions){
		return ".class public JCode\n"+
			   ".super java/lang/Object \n"+
			   "\n"+
			   ".method public static main([Ljava/lang/String;)V\n"+
		       "	.limit stack 100\n"+
			   "	.limit locals 100\n"+
			   "	\n"+
			   "	getstatic java/lang/System/out Ljava/io/PrintStream;\n"+
			    instructions +"\n"+
			   "	invokevirtual java/io/PrintStream/println(I)V\n"+
			   "	return\n"+
			   "	\n"+
			   ".end method\n";
	}
}

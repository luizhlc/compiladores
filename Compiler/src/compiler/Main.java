package compiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import aula3.LHCLexer;
import aula3.LHCParser;

public class Main {

	public static void main(String[] args) throws Exception{
		ANTLRInputStream input = new ANTLRFileStream("code.lhc");
		String output = compile(input);
		
		System.out.println(output);
		createProgram(output);
	}
	
	public static String compile(ANTLRInputStream input){
		LHCLexer lexer = new LHCLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		LHCParser parser = new LHCParser(token);
		ParseTree tree = parser.program();
		String instructions = new MyVisitor().visit(tree);
		return createJasminFile(instructions);
	}
	
	private static void createProgram(String program){
		try {
			File file = new File("./JCode.j");
 
			if (!file.exists()) {
				file.createNewFile();
			}
 
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(program);
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String createJasminFile(String instructions){
		return ".class public JCode\n"+
			   ".super java/lang/Object \n"+
			   "\n"+
			   ".method public static main([Ljava/lang/String;)V\n"+
		       "	.limit stack 100\n"+
			   "	.limit locals 100\n"+
			   "	\n"+
			    instructions +"\n"+
			   "	return\n"+
			   "	\n"+
			   ".end method\n";
	}
}

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
	
	public static String ProgramName = "HelloWorld";

	public static void main(String[] args) throws Exception{
		ANTLRInputStream input = new ANTLRFileStream(ProgramName+".lhc");
		String output = compile(input);
		
		System.out.println(output);
		createProgram(output);
	}
	
	public static String compile(ANTLRInputStream input){
		LHCLexer lexer = new LHCLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		LHCParser parser = new LHCParser(token);
		
		ParseTree tree = parser.program();
		MyVisitor visitor = new MyVisitor();
		String instructions = visitor.visit(tree);
		
		return createJasminFile(instructions);
	}
	
	private static void createProgram(String program){
		try {
			File file = new File("./"+ProgramName+".c");
 
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
		return ".class public "+ProgramName+"\n"+
			   ".super java/lang/Object \n"+
			   "\n"+
			    instructions;
	}
}

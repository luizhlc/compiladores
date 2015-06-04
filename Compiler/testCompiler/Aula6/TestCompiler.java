package Aula6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import jasmin.ClassFile;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import compiler.Main;


public class TestCompiler {
	private Path tempDir;
	
	@BeforeMethod
	public void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory("compilerTest");
	}
	
	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}
	
	private void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for(File child : file.listFiles()) {
				deleteRecursive(child);
			}
		}
		if (!file.delete()) {
			throw new Error("Could not delete file <" + file + ">");
		}
	}

	@Test(dataProvider = "provide_code_expectedText")
	public void runningCode_outputsExpectedText(
			String code, String expectedText) throws Exception {
		// execution
		String actualOutput = compileAndRun(code);
		
		// evaluation
		Assert.assertEquals(actualOutput, expectedText);
	}
	

	

	
	@DataProvider
	public Object[][] provide_code_expectedText() {
		return new Object[][]{
				{"(true | false )", "1" + System.lineSeparator()},
				{"(false | false )", "0" + System.lineSeparator()},
				
		};
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
		try(OutputStream output = Files.newOutputStream(outputPath)) {
			classFile.write(output);
		}
		return runJavaClass(tempDir, classFile.getClassName());
	}

	private String runJavaClass(Path dir, String className) throws Exception {
		Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
		try(InputStream in = process.getInputStream()) {
			return new Scanner(in).useDelimiter("\\A").next();
		}
	}
}

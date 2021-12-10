package inOutput.bestandTypen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWriting {
	public static void main(String[] args) throws IOException {
		File file = new File("voorbeeld.txt");
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println("We zitten nu aan hoofdstuk 4");
		printWriter.println("Dit is de 2de line");
		printWriter.print("Dit is een print");
		printWriter.print("Dit is de volgende print");
		printWriter.close();
		/*
		 * print, print alles achterelkaar, println print het per LINE
		 */
		
		
	}

}

package Hoofdstuk3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BestandHorizontaal {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("DagelijkswerkHorizontaal"));
		
		scanner.nextLine();
		scanner.nextLine();
		scanner.nextLine();
		
		String a = scanner.next();
		int punt1a = scanner.nextInt();
		int punt2a = scanner.nextInt();
		int punt3a = scanner.nextInt();
		int punt4a = scanner.nextInt();
		
		double gemA = (punt1a + punt2a + punt3a + punt4a  ) /4;
		
		String b = scanner.next();
		int punt1b = scanner.nextInt();
		int punt2b = scanner.nextInt();
		int punt3b = scanner.nextInt();
		int punt4b = scanner.nextInt();
		
		double gemB = (punt1b + punt2b + punt3b + punt4b  ) /4;
		
		String c = scanner.next();
		int punt1c = scanner.nextInt();
		int punt2c = scanner.nextInt();
		int punt3c = scanner.nextInt();
		int punt4c = scanner.nextInt();
		
		double gemC = (punt1c + punt2c + punt3c + punt4c  ) /4;
		
		String d = scanner.next();
		int punt1d = scanner.nextInt();
		int punt2d = scanner.nextInt();
		int punt3d = scanner.nextInt();
		int punt4d = scanner.nextInt();
		
		double gemD = (punt1d + punt2d + punt3d + punt4d ) /4;
		
		double totaal = (gemA + gemB + gemC + gemD) /4;
		
		File file = new File("gemiddeldeH");
		FileWriter filewriter = new FileWriter(file);
		PrintWriter printwriter = new PrintWriter(filewriter);
		
		printwriter.println("Naam:       Gemiddelde");
		printwriter.println(a +"       " + gemA);
		printwriter.println(b +"       " + gemB);
		printwriter.println(c +"       " + gemC);
		printwriter.println(d +"       " + gemD);
		
		printwriter.println();
		printwriter.println("Totaal  " + totaal);
		printwriter.close();
		
		
	}

}

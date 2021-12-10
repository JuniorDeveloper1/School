package Hoofdstuk3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Verticaal_Bestand {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("DagelijkswerkVerticaal"));
		
		double gem1 = 0;
		double gem2 = 0;
		double gem3 = 0;
		double gem4 = 0;
		
		scanner.next();
		scanner.next();
		scanner.next();
		//Tot aan Namen
		
		/*
		 * De namen zijn:
		 * A: Josh
		 * B: Roy
		 * D: Marco
		 * C: Bravo
		 */
		
		String a = scanner.next();
		String b = scanner.next();
		String c= scanner.next();
		String d= scanner.next();
		
		String punt1= scanner.next();
		int punt1a  = scanner.nextInt();
		int punt1b = scanner.nextInt();
		int punt1c  = scanner.nextInt();
		int punt1d  = scanner.nextInt();
		
		//Gemiddelde Josh
		gem1 = (double) (punt1a + punt1b + punt1c+ punt1d) / 4;
		
		
		String punt2 = scanner.next();
		int punt2a = scanner.nextInt();
		int punt2b = scanner.nextInt();
		int punt2c = scanner.nextInt();
		int punt2d = scanner.nextInt();
		
		//Gemiddelde Roy
		gem2 = (double) (punt2a + punt2b + punt2c+ punt2d) / 4;
		
		String punt3 = scanner.next();
		int punt3a = scanner.nextInt();
		int punt3b = scanner.nextInt();
		int punt3c = scanner.nextInt();
		int punt3d = scanner.nextInt();
		
		//Gemiddelde Marco
		gem3 = (double) (punt3a + punt3b + punt3c+ punt3d) / 4;
		
		String punt4 = scanner.next();
		int punt4a = scanner.nextInt();
		int punt4b = scanner.nextInt();
		int punt4c = scanner.nextInt();
		int punt4d = scanner.nextInt();
		
		//Gemiddelde Bravo
		gem4 = (double) (punt4a + punt4b + punt4c+ punt4d) / 4;
		
		double TOTAAL = (gem1 + gem2 + gem3 + gem4) / 4;
		
		File file = new File("VerticaalV");
		FileWriter  filewriter = new FileWriter(file);
		PrintWriter printwriter = new PrintWriter(filewriter);
		
		printwriter.println("Naam:          Gemiddelde:");
		
		printwriter.println(a + "       " + gem1);
		printwriter.println(b  + "       " + gem2);
		printwriter.println(c  + "       " + gem3);
		printwriter.println(d + "       " + gem4);
		
		printwriter.println();
		printwriter.println("Totaal:  " + TOTAAL);
		
		
		
/*
 * Dit is een Stukje dat ik voor me zelf heb gemaakt met if statements
 */
		
		if(a == "Josh") {
			printwriter.println("Josh bestaat");
		}
		if(TOTAAL >= 80) {
			printwriter.println("");
			printwriter.println("De klas kent de leerstof goed");
		}else if(TOTAAL == 67.625) {
			printwriter.print("De klas gemmidelde stinkt");
		}else {
			printwriter.println("Neem maar ontslag");
		}
		
		printwriter.close();
/*
 * Punten_1
56
90
85
84
Punten_2
56
75
89
80
Punten_3
80
60
40
87
Punten_4
52
14
80
54
 */
		
		
	}
}

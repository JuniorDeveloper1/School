package inOutput.Oefeningen.oef3_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef3_3_5 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("oef3_3_5.txt"));
		//5strings
		//3 Doubles
		double gem = 0;
		
		//st = staat
		//bv1.. = bevolking1
		String STAAT = scanner.next();
		String st1 = scanner.next();
		String st2 = scanner.next();
		String st3 = scanner.next();
		String BEVOLKING = scanner.next();
		
		double bv1 = scanner.nextDouble();
		double bv2 = scanner.nextDouble();
		double bv3 = scanner.nextDouble();
			   gem = (bv1 + bv2 + bv3) / 3;
	  
				  // Gem st1
	   double gemBv1 = (bv1 / gem) * 100;
	   		  gemBv1 = 100 - gemBv1;
	   		  // Gem st2	   		  
	   double gemBv2 = (bv2 / gem) * 100;
	   		  gemBv2 = gemBv2 - 100;
	   		  // Gem st3	   		  
	   double gemBv3 = (bv3 / gem) * 100;
	          gemBv3 = gemBv3 - 100;
	   
	        
	          File file = new File("bevolking.txt");
	   	   FileWriter filewriter = new FileWriter(file);
	   	   PrintWriter printwriter = new PrintWriter(filewriter);
	   
	   char p = '%';
	   
	   printwriter.println("Staat:        Bevolking:       Verschil:");
	   printwriter.println(st1 +"        " + bv1 + "           " + gemBv1 + p);
	   printwriter.println(st2 +" " + bv2 + "           " + gemBv2 + p);
	   printwriter.println(st3 +"  " + bv3 + "           " + gemBv3 + p);
	   
	   printwriter.close();

	}

	
	/*
	 * Code die in de klas is gemaakt(Als alles net zoals het documentje is overgetypt (in blokken)):
	 * 
	 * Scanner scnanner = new Scanner(new File(bestand.txt));
	 * 
	 * scanner.nextLine();
	 * String stad1 = scanner.next();
	 * int bevolking1 = scanner.nextInt();
	 * String stad2 = scanner.next();
	 * int bevolking2 = scanner.next();
	 * String stad3 = scanner.next();
	 * int bevolking3 = scanner.next();
	 * 
	 * int gemiddeldeBevolking = (bevolking1 + bevolking2 + bevolking3) / 3;
	 * 
	 * double verschil1 = (double) (bevolking1 - gemiddeldeBevolking)/(double)gemmideldeBevolking * 100;
	 * 
	 * double verschil2 = (double) (bevolking1 - gemiddeldeBevolking)/(double)gemmideldeBevolking * 100;
	 * 
	 * double verschil3 = (double) (bevolking1 - gemiddeldeBevolking)/(double)gemmideldeBevolking * 100;

	 * 
	 * File file = new File("bevolking.txt");
	   FileWriter filewriter = new FileWriter(file);
	   PrintWriter printwriter = new PrintWriter(filewriter);
	 * 
	 * printwriter.println("staat         bevolking      verschil");
	 * printwriter.println(stad1 + "   " + bevolking1 + "   "+ verschil1);
	 * printwriter.println(stad2 + "   " + bevolking2 + "   "+ verschil2);
	 * printwriter.println(stad3 + "   " + bevolking3 + "   "+ verschil3);
	 * printwriter.close();
	 */
}



/*
 * Onderstaande tabel geeft de bevolking (in duizenden) van 3 Amerikaanse staten.
 *  Schrijf een programma dat de gemiddelde bevolking geeft, en voor elke staat het verschil 
 *  													in bevolking en dat gemiddelde, in %. 
 *  Schrijf dit weg in een nieuw tekstbestand dat je “bevolking.txt” noemt. 
 * Staten en bevolkingscijfers moeten eerst in een tekstbestand gestopt worden
 */

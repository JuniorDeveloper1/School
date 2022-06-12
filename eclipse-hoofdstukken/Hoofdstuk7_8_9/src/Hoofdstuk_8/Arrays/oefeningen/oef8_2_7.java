package Hoofdstuk_8.Arrays.oefeningen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef8_2_7 {
	
	public static void main(String[] args) throws IOException  {
		
		Scanner scanner = new Scanner(new File("oef_7.txt"));
		File file = new File("arrays.txt");
		FileWriter filewriter = new FileWriter(file);
		PrintWriter printwriter = new PrintWriter(filewriter);
		int[] getal1 = new int[10];
		
		
		printwriter.println("Kolom 1     Kolom2      Kolom3");
		printwriter.println("------------------------------");
		
	//Lezen getallen document
		int kolom1 =0;
		for(int i = 0; i < getal1.length; i++) {
			getal1[i] = scanner.nextInt();
			/*
			 * kolom1 = getal1[i]; 
			 * printwriter.println(kolom1 + "   ");
			 */
			
		}
		
		/*
		 * //Omgekeerde volgorde
		 * 
		 * int kolom2 = 0; for(int i = getal1.length; i < getal1.length ; i++) {
		 * getal1[i] = i; kolom2 = getal1[i];
		 * 
		 * System.out.println(getal1[i]);
		 * 
		 * }
		 * 
		 * 
		 */
		
		
	//Wegschrijven array in tekstbestad
		for(int i = 0; i < getal1.length; i++) {
			printwriter.println( "| " + getal1[i] + "            " + getal1[getal1.length - 1 - i] + "          " +((getal1[i]) + getal1[getal1.length - 1 -i]) / 2D + " |");
			
			
			System.out.println(getal1[getal1.length - 1 - i]);
			//System.out.println(getal1[i]);
			
		}
		
		printwriter.println("------------------------------");
		printwriter.close();
		
		
	}

}

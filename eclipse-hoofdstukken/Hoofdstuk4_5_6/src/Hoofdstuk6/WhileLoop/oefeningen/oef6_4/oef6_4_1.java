package Hoofdstuk6.WhileLoop.oefeningen.oef6_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef6_4_1 {
	public static void main(String[] args) throws IOException {
		File file = new File("graden.txt");
		FileWriter filewriter = new FileWriter(file);
		PrintWriter printwriter = new PrintWriter(filewriter);

		printwriter.println("Celcius Farenheit");

		int celcius = -40;
		int farenheit = 0;

		while (celcius <= 40) {

			
			farenheit = (9/5) * celcius+32;
		    farenheit = (int)(Math.round((9D/5D) * celcius+32));

		    printwriter.println(celcius+"    "+farenheit);
		    celcius+=5;
		System.out.println(celcius + " " + farenheit);
		
		}

		printwriter.close();

		
	}
	/*
		Dit is niet mijn code! Ik vond zelf niet de logica / Oplossingen om dit optelossen.
	*/
}
	
	/*
	 * Schrijf een programma dat een tabel maakt voor de omzetting van graden Celsius naar graden Fahrenheit.  
	 * Schrijf de tabel weg in een bestand “graden.txt” met twee kolommen, van   – 40° tot + 40° in stappen van 5 graden.

	De formule is:

	F = (9/5)*C + 32

	 */


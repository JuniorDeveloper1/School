package Tekst.oefeningen.oef2_5;

import java.util.Scanner;

public class oef2_5_1 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Geef het aantal seconden.");
		int aantalSeconden = scanner.nextInt(); // geeft het aantal seconden

		double afstand = 0.320;
		 	   afstand *= aantalSeconden;
		System.out.println("Als het aantal seconden gelijk aan " + aantalSeconden +  " dan" 
		 	   + " is de afstand gelijk aan " +afstand);
		
		/*
		 * OF:
		 * double km = 0;
		 *  km = 0.320 * n;
		 *  System.out.println(km);
		 * 
		 */
       
		
	}
	/*
	1.	Als n het aantal seconden is tussen bliksem en donder, is het onweer n * 0,320 kilometer verwijderd. 
	Schrijf een programma dat voor een gegeven aantal seconden, de afstand van het onweer berekent
	 */
}

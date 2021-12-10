package inOutput.Oefeningen.oef3_3;

import java.util.Scanner;

public class oef3_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geef het begin: ");
		double begin = scanner.nextDouble();
		
		System.out.println("Geef het einde: ");
		double einde = scanner.nextDouble();
		
		double formule = 100 * begin / einde - 100;
		System.out.println("De gemiddelde stijging is: " + formule);
		
		
	}
	/*
	 * 1.	Bereken de jaarlijkse gemiddelde procentuele stijging van de prijzen in een supermarkt.  
	 * Geef  als prijs in het begin van het jaar 200 (met een scanner),
	 *  en als prijs op het einde van het jaar 215 (ook met een scanner).  De formule is dan:
	 */
}

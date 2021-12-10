package Hoofdstuk4.ifStatement.oefeningen;

import java.util.Scanner;

public class oef4_5_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geef jou rekening: ");
		double rekening = scanner.nextDouble();
		
		
		int percentage = 15;
		double fooi = (rekening / 100) * percentage;
		double minimum = 1;
			
		if(fooi >= minimum) {
			System.out.println("Jou fooi is: " + fooi);
		}else {	
			fooi = 1;
			System.out.println("De fooi is: " + fooi);
			}
}

	
	/*
	 * 1.	Schrijf een programma om de fooi te berekenen in een restaurant. 
	 * 		Deze moet 15 % zijn van de rekening, met een minimum van 1 €.
	 */
}

/*
 * Hoe in de klas gedaan? (Mijn oefening was fout berekend)
 * 
 * 		Scanner scanner = new Scanner(System.in);
		System.out.println("Geef jou rekening: ");
		double bedrag = scanner.nextDouble();
 * 		double fooi = (rekening / 100) * 15;
 * 		
 * 
		if(fooi >= minimum) {
				System.out.println("Jou fooi is: " + fooi);
			}else {	
				fooi = 1;
				System.out.println("De fooi is: " + fooi);
				}
		}
 */

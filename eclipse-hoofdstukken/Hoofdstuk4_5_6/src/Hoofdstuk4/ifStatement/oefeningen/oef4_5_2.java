package Hoofdstuk4.ifStatement.oefeningen;

import java.util.Scanner;

public class oef4_5_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double prijs = 0;
		double prijsSmoutebolMinder = 0.75;
		double prijsSmoutebolMeer   = 0.60;
		
		System.out.println("Aantal smoutebollen die jij besteld: ");
		int aantal = scanner.nextInt();
		
		if(aantal < 6) {
			prijs = (double) aantal * prijsSmoutebolMinder;
			
			System.out.println("De prijs is: " + prijs);
		} else {
			prijs = (double) aantal * prijsSmoutebolMeer;
			
			System.out.println("Jou prijs voor de smoutebollen is: " + prijs);
		}
	
		
		
		
		
	}
	/*
	 * 1.	Een smoutebollenkraam vraagt 75 cent per smoutebol als je er minder dan 6 bestelt,
	 * 															 en 60 cent voor 6 of meer stuks.
	 *      Schrijf een programma dat het aantal gewenste smoutebollen vraagt en dan de totale prijs toont.
	 */
}
/*
 * Hoe in de klas gedaan?
 */

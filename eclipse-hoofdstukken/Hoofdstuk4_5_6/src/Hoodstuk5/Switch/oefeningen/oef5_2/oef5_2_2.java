package Hoodstuk5.Switch.oefeningen.oef5_2;

import java.util.Scanner;

public class oef5_2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hoeveel huisdieren heeft u? ");
		int huisdieren = scanner.nextInt();
		
		switch(huisdieren) {
		case 0:
			System.out.println("U heeft " + huisdieren + " huisdieren");
			break;
		case 1:
			System.out.println("U heeft " + huisdieren + " huisdieren");
			break;
		case 2: 
			System.out.println("U heeft " + huisdieren + " huisdieren");
			break;
		case 3: 
			System.out.println("U heeft " + huisdieren + " huisdieren");
			break;
		default:
			System.out.println("U heeft veel huisdieren!");
		}
	}
	
/*
 * Vraag de gebruiker hoeveel huisdieren hij/zij heeft. 
 * Breng voor de getallen 0-3 een aangepaste melding op het scherm. 
 * Aantallen > 3 brengen steeds een standaardbericht op het scherm.
 */
}

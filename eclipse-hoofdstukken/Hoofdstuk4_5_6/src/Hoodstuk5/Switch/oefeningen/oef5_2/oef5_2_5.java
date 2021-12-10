package Hoodstuk5.Switch.oefeningen.oef5_2;

import java.util.Scanner;

public class oef5_2_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wat is uw attest? (A,B of C)");	
		
		String attest = scanner.next();

		switch(attest) {
		case "a":
		case "A":
			System.out.println("Proficiat, je mag naar het volgend jaar!");
			break;
		case "b":
		case "B":
			System.out.println("U heeft een B attest");
			break;
		case "c":
		case "C":
			System.out.println("U heeft een C attest");
			break;
		default: System.out.println("U kunt kiezen tussen deze attesten: A, B, C, a, b en c");
			
		
		}
		/*
		 * Je kan dit ook doen: 
		 Scanner scanner = new Scanner(System.in);
		System.out.println("Wat is uw attest? (A,B of C)");	
		String attest = scanner.next()
		
		attest = attest.toLowerCase();
		switch(attest){
		case "a": sysout...
		break;
		case "b": sysout...
		break;
		case "c": sysout...
		break;
		}
		 */
		
	}
	/*
	 * 	Schrijf een programma dat vraagt of je een A, B of C attest hebt (Mogelijke inputs zijn A, B, C, a, b, c).
	 *  Geef bij elke mogelijkheid een boodschap op het scherm.
	 */

}

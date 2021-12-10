package Hoodstuk5.Switch.oefeningen.oef5_2;

import java.util.Scanner;

public class oef5_2_3 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welke maand wenst u in nummers? ");
		int maanden = scanner.nextInt();
		
		
		switch(maanden) {
		case 1: 
			System.out.println("Januari");
			break;
		case 2:
			System.out.println("Februari");
			break;
		case 3: 
			System.out.println("Maart");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mei");
			break;
		case 6:
			System.out.println("Juni");
			break;
		case 7:
			System.out.println("Juli");
			break;
		case 8:
			System.out.println("Augustus");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10: 
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
			
		default: System.out.println("Dit kanniet!");;
		
		}
	}
	
	/*
	 * Schrijf een programma dat vraagt een maand op te geven in integervorm (1 is januari, 4 is april, …) 
	 * en vervolgens de maand in tekstvorm afdrukt.
	 * Bijvoorbeeld: de gegeven maand is 10, het programma drukt af “Oktober”.


	 */
}

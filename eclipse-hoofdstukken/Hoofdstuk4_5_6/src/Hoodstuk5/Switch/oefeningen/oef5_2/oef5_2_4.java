package Hoodstuk5.Switch.oefeningen.oef5_2;

import java.util.Scanner;

public class oef5_2_4 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welke maand wenst u in nummers? ");
		int maanden = scanner.nextInt();
		
		
		switch(maanden) {
		case 1: 
			System.out.println("Januari");
			
		case 2:
			System.out.println("Februari");
			
		case 3: 
			System.out.println("Maart");
			
		case 4:
			System.out.println("April");
			
		case 5:
			System.out.println("Mei");
			
		case 6:
			System.out.println("Juni");
			
		case 7:
			System.out.println("Juli");
			
		case 8:
			System.out.println("Augustus");
			
		case 9:
			System.out.println("September");
			
		case 10: 
			System.out.println("Oktober");
			
		case 11:
			System.out.println("November");
			
		case 12:
			System.out.println("December");
			
			
		
	}
	}

	/*
	 * Schrijf een programma dat vraagt een maand op te geven in integervorm (1 is januari, 4 is april, …) 
	 * en vervolgens in tekst alle maanden die nog resten in dat jaar (inclusief de opgegeven maand) afdrukt in tekstvorm. 
	 * Bijvoorbeeld: de gegeven maand is 10, het programma drukt af “Oktober, November, December”.
	 */
}

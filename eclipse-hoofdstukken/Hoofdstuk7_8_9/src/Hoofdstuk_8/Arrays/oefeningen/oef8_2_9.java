package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oef8_2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] getallen = new int[10];
		
		
		for(int i=0; i < getallen.length; i++) {
											//Skipt index 0
			System.out.println("Geef getal nr." + (i+1) + " in a.u.b");
			getallen[i] = scanner.nextInt();	
		}
		
		boolean oplopend = true;
		//Oplopend gesorteerd
		for(int i = 1; i<getallen.length; i++ ) {
			if(getallen[i] < getallen[i - 1]) {		
					oplopend = false;
					
	
			}
		}
		
		
		// 
		
		if(oplopend) {
			System.out.println("De array is oplopend!");
		}else {
			System.out.println("De array is niet oplopend!");
		}
		
		if(oplopend) {
			int aantalDuplicaten = 0;
			int duplicaat = -1;
			for(int i = 0; i < getallen.length - 1; i++) {
				if(getallen[i] == getallen[i+1] && getallen[i] != duplicaat) {
					aantalDuplicaten++;
					duplicaat = getallen[i];
				}
			}
			System.out.println("Er komen " + aantalDuplicaten + " getallen meer dan 1 keer voor");
		}
		
		//
	}
	
}

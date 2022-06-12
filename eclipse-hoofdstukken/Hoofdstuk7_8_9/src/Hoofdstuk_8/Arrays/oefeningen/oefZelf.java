package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oefZelf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] getallen = new int[10];
		
		for(int i = 0; i < getallen.length; i++) {
			System.out.println("Voer het getal  " + (i + 1) + "in");
			getallen[i] = scanner.nextInt();
		}
		boolean klopt = true;
		for(int i = 1; i < getallen.length; i++) {
			if(getallen[i] < getallen[i - 1]) {
				klopt = false;
			} else {
				klopt = true;
			}
		}
		
		if(klopt) {
			System.out.println("Het is oplopend");
		} else {
			System.out.println("Het is niet oplopend");
		}
		
		
	}

}

package Hoofdstuk_7.ForLoop.oefeningen;

import java.util.Scanner;

public class driehoekZelf {
	public static void main(String[] args) {
		double b = 5.6;
		int c = (int) Math.round(b);
		System.out.println(c);
		
		Scanner scanner = new Scanner(System.in);
		int amount = -1;
		System.out.println("Geef uw zijdes");
		amount = scanner.nextInt();
		int k = 1;
		
		for(int i = 0; i<amount; i++) {
			for(int x = 0; x<i; x++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (amount - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

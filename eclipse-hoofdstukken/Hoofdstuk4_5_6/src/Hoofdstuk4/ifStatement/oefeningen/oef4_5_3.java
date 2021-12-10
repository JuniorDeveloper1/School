package Hoofdstuk4.ifStatement.oefeningen;

import java.util.Scanner;

public class oef4_5_3 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Aantak stuks gekocht; ");
		
		int aantal = scanner.nextInt();
		double prijs = 0;
		double verkoopPrijsMinder = 0.25;
		double verkoopPrijsMeer   = 0.20;
		
		if(aantal > 100) { //aantal groter dan 100
		prijs = (double) aantal * verkoopPrijsMeer;
		
		System.out.println("Jou prijs is: " + prijs);
			
		}else {
			prijs = (double) aantal * verkoopPrijsMinder;
			System.out.println("Jou prijs is: " + prijs);
		}
	}

	/*
	 * Een computerwinkel verkoopt dvd’s aan 25 cent voor kleine bestellingen of 20 cent vanaf 100 stuks. 
	 *  Schrijf een programma dat het aantal gewenste dvd’s vraagt en dan de totale prijs toont
	 */
}

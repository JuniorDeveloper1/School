package Hoofdstuk4.ifStatement.oefeningen.oefeningenVerbeterd;

import java.util.Scanner;

public class oef4_5_3Verbeterd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoeveel kopies wil je?: ");
		int aantal = scanner.nextInt();
		double prijs = 0;
		if(aantal <= 100) {
			prijs = 0.05*aantal;
		}else {
			prijs = 100*0.05 + 0.03*(aantal - 100);
		}
			System.out.println("Voor "+ aantal +" kopies betaal je €" + prijs );
	}
}

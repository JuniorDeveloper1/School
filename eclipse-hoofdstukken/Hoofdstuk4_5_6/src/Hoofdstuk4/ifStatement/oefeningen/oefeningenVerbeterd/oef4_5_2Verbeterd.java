package Hoofdstuk4.ifStatement.oefeningen.oefeningenVerbeterd;

import java.util.Scanner;

public class oef4_5_2Verbeterd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoeveel smoutenbollen wenst u? ");
		int aantal = scanner.nextInt();
		double prijsPerStuk = 0.75;
		
		if(aantal < 6) {
			prijsPerStuk = 0.75;
		}
		else {
			prijsPerStuk = 0.60;
		}
		
		double totaalPrijs = aantal * prijsPerStuk;
		System.out.println("Voor " + aantal + " smoutenbollen betaalt u " + totaalPrijs);
		
		
	}
}

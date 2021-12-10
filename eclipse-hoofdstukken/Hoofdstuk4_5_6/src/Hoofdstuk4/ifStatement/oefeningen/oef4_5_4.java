package Hoofdstuk4.ifStatement.oefeningen;

import java.util.Scanner;

public class oef4_5_4 {
	public static void main(String[] args) {
		double prijs;
		double prijsOnder = 0.5;
		double prijsBoven = 0.3;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gewenste Kopies: ");
		int kopies = scanner.nextInt();
		
		if(kopies > 100) {
			prijs = (double) kopies * prijsBoven;
			System.out.println("Jou prijs is: " + prijs);
		}else {
			prijs = (double) kopies * prijsOnder;
			System.out.println("Jou prijs is: " + prijs);
		}
		
	}
 /*
  * 1.	Een kopieercentrum vraagt 5 cent voor de eerste 100 kopies en 3 cent voor elke kopie daarboven.
  *     Schrijf een programma dat het aantal gewenste kopies vraagt en dan de totale prijs toont.
  */
}

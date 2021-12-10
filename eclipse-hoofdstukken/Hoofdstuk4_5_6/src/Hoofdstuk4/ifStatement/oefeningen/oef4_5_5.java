package Hoofdstuk4.ifStatement.oefeningen;

import java.util.Scanner;

public class oef4_5_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie was de eerste wereldkampioen schaken?");
		String schaker = scanner.nextLine();
		
		if(schaker.equals("Steinitz")) {
			System.out.println("Correct!!!");
		
			
		} else {
			System.out.println("Goed geprobeerd!");
		
		}
		
	
		
	}
	/*
	 * 1.	Schrijf een quizprogramma dat vraagt “Wie was de eerste wereldkampioen schaken?”.  
	 * 		Indien het antwoord “Steinitz” is wordt er “Correct!” getoond, anders “Goed geprobeerd”.
	 */
}

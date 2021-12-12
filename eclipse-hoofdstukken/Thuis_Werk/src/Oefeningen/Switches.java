package Oefeningen;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		//Leeftijd 12,13,14
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geef je leeftijd ");
		int leeftijd = scanner.nextInt();
		
		
		
	switch(leeftijd) {
		case 12: 
			System.out.println(leeftijd);
			break;
		case 13: 
			System.out.println(leeftijd);
			break;
		case 14: 
			System.out.println(leeftijd);
			break;
			
		default: 
			System.out.println(leeftijd);
		}
		

		
		
	}
}

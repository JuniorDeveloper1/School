package Hoodstuk5.Switch;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("bab");
		int numberOfBabies = scanner.nextInt();
		switch(numberOfBabies) {
		case 0: 
			System.out.println("No babies");
			break;
		case 1:
			System.out.println("1 baby");
			break;
		case 2:
			System.out.println("Wow twins.");
			break;
		case 3:
			System.out.println("Wanneer er geen break staat! >>");
			break;
		case 4: 
			System.out.println("Wow!! you have " + numberOfBabies + " babies");
			break;
		case 69: 
			System.out.println("Jajaja");
			break;
		default: 
			System.out.println("I don't believe you!");
		}
		
		
		
	
		}

	}


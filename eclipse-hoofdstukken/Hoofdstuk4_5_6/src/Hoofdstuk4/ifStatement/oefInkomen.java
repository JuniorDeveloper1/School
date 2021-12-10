package Hoofdstuk4.ifStatement;

import java.util.Scanner;

public class oefInkomen {
	
	
	public static void main(String[] args) {
		
		double tax;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wat is jou inkomen? :");
		int inkomen = scanner.nextInt();
		
		if(inkomen <= 2000) {
			tax =  0.2 * inkomen ;
			
		}else if(inkomen <= 5000){
			tax = 400 + 0.025*(20000 - inkomen);
		} else {
			tax = 1150 + 0.035 * (50000 - inkomen);
		}
		 System.out.println(tax);
	}

}

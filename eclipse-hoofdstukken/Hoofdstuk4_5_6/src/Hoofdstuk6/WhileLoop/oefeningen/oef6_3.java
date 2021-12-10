package Hoofdstuk6.WhileLoop.oefeningen;

import java.util.Scanner;

public class oef6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int getal = 0;
		String naam = null;
		
		while(getal < 3) {
			System.out.println("Geef jou naam op");
			naam = scanner.next();
			getal ++;
			System.out.println("Jou naam is " + naam);
		}
		
	}
	/*
	Scanner scanner = new Scanner(System.in);
	String naam = null;
System.out.println("Geef een naam op:");
   naam = scanner.next();
   System.out.println(naam);
	 System.out.println("Geef een naam op:");
   naam = scanner.next();
   System.out.println(naam);
	 System.out.println("Geef een naam op:");
   naam = scanner.next();
   System.out.println(naam);

	 */
}


package Oefeningen;

import java.util.Scanner;

public class komma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wat is uw getal? Defineer uw Komma met ,");
		String i = scanner.next();
		
		String kept = i.substring( 0, i.indexOf(","));
		String remainder = i.substring(i.indexOf(",")+1, i.length());
			   
		System.out.println(kept + "  " + remainder);
		
		
	}
	
	/*
	 * In deze  opdracht zullen wij de aantal getallen na de komma en voor de komma halen.
	 * We zullen deze niet hardcoded opvragen.
	 */

}

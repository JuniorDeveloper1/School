package inOutput.Oefeningen.oef3_3;

import java.util.Scanner;

public class oef3_3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		double formule = 0;
	
		
		System.out.println("Aantal geld gestord op spaarboekje:");
		double K = scanner.nextDouble();
		System.out.println("Intrest:");
		double i = scanner.nextDouble();
		System.out.println("Aantal Jaar:");
		double n = scanner.nextDouble();
		
			  formule = (1 + i);
			  formule = Math.pow(formule, n);
			  formule += K;
			  
	  System.out.println(formule);
		
	}

	/*
	 * 1.	Als K euro op een spaarboekje gestort wordt aan een intrestvoet 
	 * 		i per jaar is het totale bedrag na 
	 *		 n jaar gegeven door de formule:
	 *
	 *			K(1 + i)^n
	 *
	 *
	 *Schrijf een programma om K, n  en i op te vragen, en bereken dan het totaal.
	 */
}

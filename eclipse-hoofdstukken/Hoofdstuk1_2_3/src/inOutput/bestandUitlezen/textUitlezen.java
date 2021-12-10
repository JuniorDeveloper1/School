package inOutput.bestandUitlezen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class textUitlezen {
	public static void main(String[] args) throws InputMismatchException, FileNotFoundException { //Als de file niet gevonden is.
		Scanner scanner  = new Scanner(new File("textbestand.txt")); //We scanner de file "TextBestand.txt", 
																   // Hiermee kunnen we bestanden lezen.
		
		
		String woord = scanner.next();
		System.out.println("Eerste Woord " + woord);
		
		
		String naam = scanner.nextLine();
		System.out.println("Naam: " + naam);
		
		
		String achternaam = scanner.nextLine();
		System.out.println("Achternaam: " + achternaam);
		
		int leeftijd = scanner.nextInt();
		System.out.println("Leeftijd: " + leeftijd);
		
	}
}

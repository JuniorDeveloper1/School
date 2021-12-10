package inOutput.Oefeningen.oef3_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class oef3_3_1 {
	public static void main(String[] args) throws FileNotFoundException, InputMismatchException {
		Scanner scanner = new Scanner(new File("oef3_3_1Text"));
		
	// In het bestand staat er 7,5, in java kan dit niet. Door dit zorgt het dat de "," naar een "." wordt veranderd.
		
		double aardGem = 0;
		double gesGem = 0 ;
		
		//aardrijkskunde
		String vak1 = scanner.next();
		double punt1v1 = scanner.nextDouble();
		double punt2v1 = scanner.nextDouble();
		
		//geschiedenis
		String vak2 = scanner.next();
		double punt1v2 = scanner.nextDouble();
		double punt2v2 = scanner.nextDouble();
		
		aardGem = (punt1v1 + punt2v1 ) / 2;
		gesGem  = (punt1v2 + punt2v2 ) / 2;
	
		System.out.println("Het gemiddelde van: "+ vak1 + " is: " + aardGem );
		System.out.println("Het gemiddelde van: "+ vak2 + " is: " + gesGem );

		/*
		 * 		//aardrijkskunde
		String vak1 = scanner.nextLine();
		double punt1v1 = scanner.nextDouble();
		double punt2v1 = scanner.nextDouble();
		
		//geschiedenis
		 * scanner.nextLine();   >>>>>>>>> Next line gaat niet werken omdat het niet in de double punt2v1 staat. 
		 * 								   Door dit gaat het naar de volgende String, waardoor het een String leest impv een double.
		String vak2 = scanner.nextLine();
		double punt1v2 = scanner.nextDouble();
		double punt2v2 = scanner.nextDouble();
		
		
		Met next(), leest het gewoon de volgende line in een String, waardoor e rgeen spatie komt.
		 */                                                                                        
	
		
		
		
		
	}
}

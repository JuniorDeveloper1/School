package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oef8_2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] punten = new int[3];
		String[] namen = new String[3];
		
		

		
		
		
		
		//Punten optellen
		for(int i = 0; i < punten.length; i++) {
			
			System.out.println("Wat is de naam van de leerling?");	
			namen[i] = scanner.next();

			System.out.println("Wat is uw score op de laatste toets?");
			punten[i] = scanner.nextInt();
		
		}
		
		//Gemiddelde
		int som = 0;
		for(int i = 0; i < punten.length; i++) {
			som += punten[i];
		}
		
		//OEFENING 8_2_2
		
		//laagste
		int laagstePunt = punten[0]; //Anders gaat 0 altijd het laagste zijn
		String laagsteNaam = namen[0];
		for(int i = 0; i<punten.length; i++) {
			if(punten[i] < laagstePunt) {
				
				laagstePunt = punten[i];
				laagsteNaam = namen[i];
			}
		}
		
		int hoogstePunt = punten[0];
		String hoogsteNaam = namen[0];
		for(int i = 0; i < punten.length; i++) {
			if(punten[i] > hoogstePunt) {
				hoogstePunt = punten[i];
				hoogsteNaam = namen[i];
			
			}
		}
		
		double gemiddelde =  som/(double) punten.length;
		
	
	System.out.println("Het gemiddelde is: " + gemiddelde);

	System.out.println("De leerling met de laagste punt is " + laagsteNaam
			+ " met " + laagstePunt + " punten");
	System.out.println("De leerling met de hoogste punt is: " + hoogsteNaam 
			+ " met " + hoogstePunt + " punten");
}
}

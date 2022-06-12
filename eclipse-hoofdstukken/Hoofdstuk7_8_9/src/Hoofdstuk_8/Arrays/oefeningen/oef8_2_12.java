package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oef8_2_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		String[] steden = new String[] {"Aalst", "Bergen", "Ciney", "Damme", "Eekolo", "Geel", "Halen", "Ieper", "Kortrijk", "Leuven"};
		
		String nieuweStad = null;
		
		for(int i = 0; i < steden.length; i++) {
			System.out.println("Geef een stad naam in!");
			String stedenAanvraag = scanner.nextLine();
			
		
			if(steden[i].equals(stedenAanvraag)) {
				System.out.println("Geef een nieuwe stad in!");
				nieuweStad = scanner.nextLine();
				nieuweStad = steden[i];
				
				
			}
						//String stedenAanvraag = scanner.nextLine();
		
		}
		for(int i = 0; i < steden.length; i++) {
			System.out.println(steden[i]);
			
		}
	}

}

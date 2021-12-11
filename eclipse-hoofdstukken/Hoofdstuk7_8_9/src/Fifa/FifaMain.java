package Fifa;

import java.util.Scanner;

import Fifa.StatsManager.BallSkills;

public class FifaMain {
	/**
	 * Dit is de fifa main, waar alles wordt opgevraagd en geset.
	 * {@link https://www.fifaindex.com/player/199556/marco-verratti/fifa18/}
	 * Hier staat alle infromatie voor de stats.
	 *
	 */

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//Vraag voor als je Stats Of Results wilt ingeven.
		System.out.println("Typ 'Results' voor Resultaten, 'Stats' om de stats in te geven");
		String totalResults = scanner.next();
		
		//De scanner test
		if(totalResults.equals("Results")) {
			Results.results();
			
		} else if(totalResults.equals("Stats")) {
			Questions.stats();
			
			System.out.println("Voer nu het commando 'Results' voor de resultaten");
			totalResults = scanner.next();
			if(totalResults.equals("Results")) { Results.results();	}
			
			
		} else {
			System.out.println("Argument niet gevonden");
		}
		
		
	}
	


	public static void results() {
	  //TODO: Create results
	}

	
}

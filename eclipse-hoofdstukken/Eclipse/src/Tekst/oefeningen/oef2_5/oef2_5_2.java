package Tekst.oefeningen.oef2_5;

public class oef2_5_2 {
	public static void main(String[] args) {
		int a  = 17; // Je leeftijd
		int r = 50; // Polsslag in rust (niet correct)
		double trainingPolsslag = 0;
			   trainingPolsslag = (double) 0.7 * (220 - a) + 0.3 * r; // Je polsslag
		
		System.out.println(String.valueOf(trainingPolsslag) + " " + "Is je training polslag voor je leeftijd.");
//		System.out.println("De polsslag is " + trainingPolsslag + " en de leeftijd is" + a);
		
	}

}
/*
1.	Sportdokters noemen je optimale polsslag tijdens een aerobics training je training pols. 
Die wordt berekend als volgt: 0.7 * (220 – a) + 0.3 * r, waarbij a je leeftijd is en r je polsslag in rust (als je pas wakker wordt).  
Schrijf een programma dat de training pols berekent voor gegeven leeftijd en polsslag.
 * 
 */
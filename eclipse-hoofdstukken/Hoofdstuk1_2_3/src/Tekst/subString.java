package Tekst;

public class subString {
	public static void main(String[] args) {
		String subString = "VOORBEELD";
						 //0123456789
		System.out.println(subString.substring(5, 8));
							//					EEL
		
		String voornaam = "Wa lid";
	  //                   012345
		 String x = voornaam.substring(3);
		 System.out.println(x);
		
		 x = voornaam.substring(3,5);
		 						//3 tot 4 (5 telt niet mee >> 3 tot 5 ; 3 stopt bij 5
		 System.out.println(x);
		
		
		
		
	}

}

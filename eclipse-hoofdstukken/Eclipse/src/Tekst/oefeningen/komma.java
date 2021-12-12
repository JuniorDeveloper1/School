package Tekst.oefeningen;

import java.util.Scanner;

public class komma {
	
   public static void main(String[] args) {
	   Scanner scanner = new Scanner (System.in);
	    System.out.println("Geef een positief kommagetal in");
	    String kommagetal = scanner.next();
	   
	    int indexvankomma = kommagetal.indexOf(".");
	    
	    String eerste = kommagetal.substring(0,indexvankomma);
	    String tweede = kommagetal.substring(indexvankomma+1);
	    
	    
	    System.out.println(eerste + "\n\n");
	    
	    int LengteEen = eerste.length();
	    int LengteTweede = tweede.length();
	    System.out.println("Het getal heeft "+LengteEen+" cijfers voor de komma en "+LengteTweede+" cijfers na de komma");
   }
}

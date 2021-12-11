package Oefeningen;

public class komma {
	public static void main(String[] args) {
		String i = "234,5";
		
		String kept = i.substring( 0, i.indexOf(","));
		String remainder = i.substring(i.indexOf(",")+1, i.length());
			   
		System.out.println(kept + "  " + remainder);
		
		
	}
	
	/*
	 * In deze  opdracht zullen wij de aantal getallen na de komma en voor de komma halen.
	 * We zullen deze niet hardcoded opvragen.
	 */

}

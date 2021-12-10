package Hoofdstuk6.WhileLoop.oefeningen.oef6_4;

public class Bevolking {
	public static int  test;
	public static void main(String[] args) {
		int jaar = 1999;
		long bevolking=  6000000000L;
		
		while(bevolking > 6000000) {
			bevolking = (long) bevolking / 2;
			jaar = jaar - 40;
			System.out.println("De bevolking is: " + bevolking + " in het jaar " + jaar);
	        
					
		}
		
	}

	
	
	

}


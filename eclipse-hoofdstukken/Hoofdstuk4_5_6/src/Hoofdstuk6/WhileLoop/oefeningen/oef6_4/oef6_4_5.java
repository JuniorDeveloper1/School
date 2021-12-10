package Hoofdstuk6.WhileLoop.oefeningen.oef6_4;

public class oef6_4_5 {
	public static void main(String[] args) {
	
		
		int  jaar = 2006;
		long bevolking = 6500000000L;
		
		while(bevolking < 10000000000L) { //Als bevolking kleiner is dan 10 miljard
			double percentage = (long) (bevolking/100) * 1.2;
			bevolking += percentage;
			
			/* bevolking= (long) (bevolking*1.2/100) + bevolking; */
			
			jaar++;
			System.out.println( jaar + "   "+bevolking);
		}	
		
	}
	/*
	 * De wereldbevolking in 2006 was 6,5 miljard en groeide elk jaar met 1,2 %. In
	 * de veronderstelling dat de groei aan hetzelfde tempo voortduurt, zoek dan uit
	 * in welk jaar de wereldbevolking 10 miljard zal zijn.
	 */
}

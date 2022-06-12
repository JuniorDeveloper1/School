package While;

public class Bevolking {
	public static void main(String[] args) {
		
		
		/*
		 * long totalebevolking = 6000000000L; int jaar = 1999;
		 * 
		 * while(totalebevolking > 6000000) { totalebevolking = (long) totalebevolking /
		 * 2; jaar -= 40;
		 * 
		 * System.out.println("Het jaar is: "+ jaar + " De Bevolking is :" +
		 * totalebevolking); }
		 */
		
		
		int jaar2 = 2006;
		long totalebevolking2 = 6500000000L;
		while(totalebevolking2 < 10000000000L) {
			double percentage = (long) ((totalebevolking2 / 100) *  1.2);
			totalebevolking2 += percentage;
			jaar2++;
			
			System.out.println("Het jaar is: " + jaar2 + "De bevolking is: " + totalebevolking2);
			
			
		}
		
	}
	
	
}

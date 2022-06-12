package Hoofdstuk_8.Arrays.oefeningen;

public class oef8_2_3 {
	public static void main(String[] args) {
		
		double[] p = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double[] q = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 		//double[] p = new double[20];
		//double[] q = new double[20];
		double total = 0;
		
		
	
		
		for(int i = 0; i < p.length; i++) {
		
			total += q[i] * p[i];
				
				//System.out.println("q: " + i + ", " + "p: " + i + " Total: " + total);
	
		}
		System.out.println("Total2: " + total);
	}

}

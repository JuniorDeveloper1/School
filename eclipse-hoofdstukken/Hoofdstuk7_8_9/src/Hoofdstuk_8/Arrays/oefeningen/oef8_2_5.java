package Hoofdstuk_8.Arrays.oefeningen;

public class oef8_2_5 {

		public static void main(String[] args) {
			int[] getal1 = new int[]  {1,2,3,4,5,3,7,8,9,10};
			int[] getal2 = new int[] {1,2,3,4,5,6,7,8,9,10};
			
			for(int i = 0; i < getal1.length; i++) {			
					if(getal1[i] == getal2[i]) {
						System.out.println("i " + i  + "Equal!!");
					} else {
						System.out.println( "getal " + getal1[i] + " is not equal with getal " +
								 getal2[i]
								);
					
				}
				
			
			}
			
			
			
			
			
			
			
}
			
		
			
	
			
			
			
		}

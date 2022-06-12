package Hoofdstuk_8.Arrays.oefeningen;

public class oef8_2_6 {

	public static void main(String[] args) {
		int[] getal = new int[10];
		//int[] getal = {1,2,3,4,5,6,7,8,9,10};
		  
		//int som = 0;
		for(int i = 0; i < getal.length ; i++) {
			
			/**
			 * if(i%2==1) {
			 * som+=a[i];
			 * }
			 */
			i += 1;
			getal[i] = i;
			
			System.out.println(getal[i]);
		}
		//sout(som);
		
		//Oplossing2
		System.out.println("Oplossing 2");
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int som = 0;
		for(int i = 1; i < a.length; i+=2) {
			if(a[i]%2 !=0) {
				som+=a[i];
				
			}
		
		}
		System.out.println(som);
	}
}

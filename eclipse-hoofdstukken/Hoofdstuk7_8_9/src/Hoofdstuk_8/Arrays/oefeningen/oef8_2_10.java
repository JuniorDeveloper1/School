package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oef8_2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array1 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,-20};
		int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] arraySamen = new int [40]; 
		
		
				for(int i = 0; i < arraySamen.length; i++) {
					if(array1[i] <= array2[i]) {
						arraySamen[i] = i;
						
					} else {
						arraySamen[i] = i;
					}
					System.out.println(arraySamen[i]);
				}

			
			
	}
}

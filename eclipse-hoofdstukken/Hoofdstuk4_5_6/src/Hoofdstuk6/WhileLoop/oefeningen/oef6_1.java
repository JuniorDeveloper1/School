package Hoofdstuk6.WhileLoop.oefeningen;

public class oef6_1 {
	public static void main(String[] args) {
		int q = 3;
		while (q < 15) {

			q = 2 * q - 1;

		}
		System.out.println(q);
		
		
		
		
		int amount = 5;
		for(int i = 0; amount < i; i++) {
			for(int j = 0; j < (amount - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	


}

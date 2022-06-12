package Hoofdstuk_8;

public class test {
	public static void main(String[] args) {
		int[][] tabel = new int[10][10];
		int getal = 1;
		

		for(int i = 0; i < tabel.length; i++) {
			for(int j = 0; j < tabel.length; j++) {
				tabel[i][j] = getal;
				getal++;
			}
		} //END Getal
		
		for(int i = 0; i < tabel.length; i++) {
			
			if(i % 2 == 0) {
				
			
			for(int j = 0; j < tabel.length; j++) {
				System.out.print(tabel[i][j] + " ");
			}
			
			}else {
			
				for(int j = 0; j < tabel.length; j++) {
					System.out.print(tabel[i][j] + " ");
				 }
			}
			System.out.println();
		}
	
		
	}

	/**
	 *  0 1 2 3 4 5 6 7 8 9
	 * 0[][][][][][] * 2
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 * 6
	 * 7
	 * 8
	 * 9
	 *
	 */
}

package Hoofdstuk_8.Arrays2D;

public class Oefening1 {                   
	public static void main(String[] args) {
		int[][] tabel = new int[10][10];
		int getal = 1;
		
		
		for(int i = 0; i < tabel.length; i++) {
			for(int j = 0; j < tabel.length; j++) {
				tabel[i][j] = getal;
				getal++;
				
				//System.out.println("Getal = " + getal);
			}
		}
		
		for(int i=0; i < tabel.length; i++) {
			if(i%2 == 0) { //true, even -> afdrukking in de juist volgorde
		
				for(int j = 0; j<tabel.length; j++) {
					System.out.print(tabel[i][j] + " ");
					
					//System.out.println("i1 = " + i + " j1 = " + j);

					}
		
			} else { //False, oneven --> afdrukken in de omgekeerde volgorde.
				for(int j = tabel.length-1; j >= 0; j--) {
					System.out.print(tabel[i][j] + " ");
					
					//System.out.println("i2 = " + i + " j2 = " + j);
					
					//System.out.println("---");
					//System.out.println(j);
					//System.out.println("---");
					
					}
				
			}
			System.out.println();
			
		} // END
	}

}

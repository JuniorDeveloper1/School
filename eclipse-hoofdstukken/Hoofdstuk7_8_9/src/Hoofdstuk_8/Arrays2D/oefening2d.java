package Hoofdstuk_8.Arrays2D;

public class oefening2d {
	public static void main(String[] args) {

		int[][] tabel = new int[10][10];
		int getal = 1;

		for (int i = 0; i < tabel.length; i++) {
			for (int j = 0; j < tabel.length; j++) {
		tabel[i][j] = getal;
		getal++;
			}
		}

	
		for(int j = 0; j < tabel.length; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i <tabel.length; i++) {
					System.out.print(tabel[i][tabel.length-1-j] + " ");
				}
			}else {
				for(int i = 0; i < tabel.length; i++) {
					System.out.print(tabel[i][tabel.length - 1 - j] + " ");
				}
			}
			System.out.println();
		}

	}

}

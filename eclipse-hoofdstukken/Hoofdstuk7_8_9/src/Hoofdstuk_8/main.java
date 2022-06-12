package Hoofdstuk_8;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int[][] tabel = new int[10][10];
		int getal = 1;
		
		
		for(int i = 0; i < tabel.length; i++) {
			for(int j = 0; j < tabel.length; j++) {
				tabel[i][j] = getal;
				getal++;
			}
		}
		
		for(int i = 0; i < tabel.length; i++) {
			for(int j = 0; j < tabel.length; j++) {
				if(i % 2 == 0) {
					System.out.print(tabel[i][j] + " ");
				}else {
					System.out.print(tabel[i][tabel.length - 1 - j] + " ");
				}
			}
			System.out.println();
		}
		
	
		
 }
}

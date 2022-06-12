package Hoofdstuk_8.Arrays.oefeningen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef8_2_4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner= new Scanner(new File("nummers"));
		int[] a= new int[10];
		for(int i=0; i<40; i++) {
		a[scanner.nextInt()]++;
		}
		for(int i=0; i<a.length; i++) {
		System.out.println("het aantal keer "+i+" = "+a[i]);
		
		}
		
	}
}

package Hoofdstuk_8.Arrays.oefeningen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class oef8_2_11 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int[] punten = new int[3];
		String[] leerling = new String[3];


		for (int i = 0; i < punten.length; i++) {
		System.out.print("leerling?");
		leerling[i] = scanner.next();
		System.out.println("score?");
		punten[i] = scanner.nextInt();
		}

		int som = 0;
		for (int i = 0; i < punten.length; i++) {
		som += punten[i];
		}
		double gem = som/(double)punten.length;

		int laagste = punten[0];
		String laagsteL = leerling[0];
		for (int i = 0; i < punten.length; i++) {
		if (punten[i]<laagste) {
		laagste = punten[i];
		laagsteL = leerling[i];
		}
		}

		int hoogste = punten[0];
		String hoogsteL = leerling[0];
		for (int i = 0; i < punten.length; i++) {
		if (punten[i]>hoogste) {
		hoogste = punten[i];
		hoogsteL = leerling[i];
		 }
		}
		System.out.println("gem = "+gem);
		System.out.println("laagste = "+laagste+" van: "+laagsteL);
		System.out.println("hoogste = "+hoogste+" van: "+hoogsteL);


	}

}

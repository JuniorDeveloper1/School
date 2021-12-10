package inOutput.Oefeningen.oef3_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef3_3_3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("oef3_3_3.txt"));
		
		double volSaldo1 = 0;
		double volSaldo2 = 0;
		double volSaldo3 = 0;
		
		String rekeningnummer = scanner.next();
		
		String rekNum1 = scanner.next();
		String rekNum2 = scanner.next();
		String rekNum3 = scanner.next();
		
		String vorig_saldo = scanner.next();
		double saldo1 = scanner.nextDouble();
		double saldo2 = scanner.nextDouble();
		double saldo3 = scanner.nextDouble();
		
		String stortingen = scanner.next();
		double stort1 = scanner.nextDouble();
		double stort2 = scanner.nextDouble();
		double stort3 = scanner.nextDouble();
		
		String afhalingen = scanner.next();
		double afhal1 = scanner.nextDouble();
		double afhal2 = scanner.nextDouble();
		double afhal3 = scanner.nextDouble();
		
			   volSaldo1 = saldo1 + stort1 - afhal1;
			   volSaldo2 = saldo2 + stort2 - afhal2;
			   volSaldo3 = saldo3 + stort3 - afhal3;
		

		System.out.println("Het nieuwe saldo van Rekeningnummer: " + rekNum1 +
				" is " + volSaldo1);
		System.out.println("Het nieuwe saldo van Rekeningnummer: " + rekNum2 +
				" is " + volSaldo2);
		System.out.println("Het nieuwe saldo van Rekeningnummer: " + rekNum3 +
				" is " + volSaldo3);
		

		
		 File file = new File("nieuw_saldo.txt");
		 FileWriter filewriter = new FileWriter(file);
		 PrintWriter printwriter = new PrintWriter(filewriter);
		 
		 		 printwriter.println("rekeningnummer     NieuwSaldo");
				 printwriter.println(rekNum1+"  "+volSaldo1);
				 printwriter.println(rekNum2+"  "+volSaldo2);
				 printwriter.println(rekNum3+"  "+volSaldo3);
				 printwriter.close();
	}
	/*
	 * Als je het document letterlijk had over getyped van links naar rechts(Niet onderelkaar) gaat de code zo:
	 * 
	 * Scanner scanner = new Scanner(new File("nieuw_saldo.txt"));
	 * 
	 * scanner.nextLine();
	 * 
	 * String rekeningnumer1 = scanner.next();
	 * double vorigSaldo1 = scanner.nextDouble();
	 * double storting1 = scanner.nextDouble();
	 * double afhaling1 = scanner.nextDouble();
	 * 
	 * String rekeningnumer2 = scanner.next();
	 * double vorigSaldo2 = scanner.nextDouble();
	 * double storting2 = scanner.nextDouble();
	 * double afhaling2 = scanner.nextDouble();
	 * 
	 * String rekeningnumer3 = scanner.next();
	 * double vorigSaldo3 = scanner.nextDouble();
	 * double storting3 = scanner.nextDouble();
	 * double afhaling3 = scanner.nextDouble();
	 * 
	 * double nieuwSaldo1 = vorigSaldo1 + storting1 - afhaling1;
	 * double nieuwSaldo1 = vorigSaldo2 + storting2 - afhaling2;
	 * double nieuwSaldo1 = vorigSaldo3 + storting3 - afhaling3;
	 * 
	 *File file = new File("nieuw_saldo.txt");
	 *FileWriter filewriter = new FileWriter(file);
	 *PrintWriter printwriter = new PrintWriter(filewriter);
	 *
	 *printwriter.println(rekeningnummer     NieuwSaldo");
	 *printwriter.println(rekeningnummer1+"  "+nieuwSaldo1");
	 *printwriter.println(rekeningnummer2+"  "+nieuwSaldo2");
	 *printwriter.println(rekeningnummer3+"  "+nieuwSaldo3");
	 * 
	 */
}

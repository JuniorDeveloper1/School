package Hoofdstuk_8.Arrays.oefeningen;

import java.util.Scanner;

public class oef8_2_8 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String[] maanden = new String[]{"Januari", "Februari", "Maart", "April", "Mei","Juni", "Juli", "Augustus", "September", "Oktober", "November", "December"};
	System.out.println("Geef uw maand in nummers");
	int maand_nummer = scanner.nextInt();
	
	System.out.println("Op nummer " + maand_nummer + " staat de maand " + maanden[maand_nummer - 1]);
	}

}


/**

for(int i = 0; i < getal.length; i++) {
	getal[i] = scanner.nextInt();
	

 
	switch(getal[i]) {
	case 1:
		System.out.println("Januari");
		break;
	case 2:
		System.out.println("Februari");
		break;
	case 3:
		System.out.println("Maart");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("Mei");
		break;
	case 6:
		System.out.println("Juni");
		break;
	case 7:
		System.out.println("Juli");
		break;
	case 8:
		System.out.println("Augustus");
		break;
	case 9:
		System.out.println("September");
		break;
	case 10:
		System.out.println("Oktober");
		break;
	case 11:
		System.out.println("November");
		break;
	case 12:
		System.out.println("December");
		break;
	default: 
		System.out.println("Dit is geen maand!");
	
	}
	
}

*/
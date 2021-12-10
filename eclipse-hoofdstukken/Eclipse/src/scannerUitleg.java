import java.util.Scanner;

public class scannerUitleg {
	public static void main(String[] args) {
		//Dit maakt een scanner aan waarmee je dingen via het toetsenbord kan inlezen.
		Scanner scanner = new Scanner(System.in);
		
		//dit is een voorbeeld waarbij  je tekst inlees in een variable
		System.out.println("geef je tekst");
		String tekst = scanner.nextLine();
		System.out.println(tekst);
		
		// Dit is een voorbeeld waarbij je een double inleest in een variable
		double getal = scanner.nextDouble();
		
	}

}

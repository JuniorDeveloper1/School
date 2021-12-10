package Tekst;

public class Trim {
	public static void main(String[] args) {
		String voornaam = "  Walid ";
		System.out.println(voornaam.length());
		voornaam = voornaam.trim();
		System.out.println(voornaam.length());
	}

}

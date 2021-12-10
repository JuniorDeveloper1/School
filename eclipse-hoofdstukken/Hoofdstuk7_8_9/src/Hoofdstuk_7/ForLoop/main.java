package Hoofdstuk_7.ForLoop;

public class main {
	public static void main(String[] args) {
		int resultaat = 0;
		int getal = 6;
		
		for(int i=1; i<=5; i++) {
			resultaat = resultaat + getal;
			System.out.println(resultaat);
		}
		
		for(int p = 1; p<=1000; p++) {
			System.out.println(p + " " + "test");
		}
	}

}

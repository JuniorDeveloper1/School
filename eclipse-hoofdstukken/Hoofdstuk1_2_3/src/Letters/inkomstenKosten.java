package Letters;

public class inkomstenKosten {
	public static void main(String[] args) {
		//juist
		int inkomsten = 98456;
		int kosten = 45000;
		int totaal = inkomsten - kosten;
		System.out.print(totaal+ "\n\n");
		
		
		//juist
		double prijsPerStuk = 25.625;
		double aantalStuks = 400;
		double totalePrijs = aantalStuks * prijsPerStuk;
		System.out.print(totalePrijs + "\n\n");
		
		//Foute oefening
		double prijs = 19.95;
		int percent = 30;
		double korting = (double)percent / 100 * prijs; 
			   prijs  -= korting;
			   //prijs= prijs - korting
		System.out.print("test " +korting + "\n\n");
		/*
		 * De fout:
		 * 	Percent wordt gecased naar een integer, waarbij percent = 0 is. Dus we hebben 0 korting
		 * 30 / 100 = O.30 --> Door een int is 30/ 100 = 0
		 * We kunnen dit fixen door een typecast of de variable naar double te vervangen. 
		 * Double pakt zelf teveel geheugen mee.
		 */
		
		int vasteKosten = 5000;
		int prijsPerStuk2 = 8;
		int kostenPerStuk = 6;
		int breakEven = vasteKosten/(prijsPerStuk2 - kostenPerStuk);
		System.out.print(breakEven + "\n\n");
		
		
		double saldo = 100;
			   saldo += saldo/100 * 5;
			   saldo += saldo/100 * 5;
			   saldo += saldo/100 * 5;
			   System.out.print("tests  "+ saldo);
			   
		
	  double saldo2 = 100;
	  		 saldo2 = saldo2 * Math.pow(1.05,10);
	  System.out.print("   " + saldo2 + "\n\n\n");
	  
	  
	  double aankoopPrijs = 10;
	  double verkoopPrijs = 15;
	  double percentWinst = verkoopPrijs - aankoopPrijs/(verkoopPrijs * 100);
	  System.out.print("\n\n   "+percentWinst);
	  		 
			   
		
		
		
	}

}

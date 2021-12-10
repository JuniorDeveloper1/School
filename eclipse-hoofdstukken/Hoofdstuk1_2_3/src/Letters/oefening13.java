package Letters;

public class oefening13 {
	public static void main(String[] args) {
		double hectare = 18; // 18 ton aan graan
		double totaleHectare = 30 * hectare;
		System.out.print(totaleHectare + "/n/n");
		
		
		
		
		
		
		//-16t^2+v_0 t+h_0 (waarbij v_0 de beginsnelheid is en h_0 de beginhoogte, t is de tijd )

		double tijd = 3;
		double beginSnelheid = 50; // per seconden
		double beginHoogte = 20; // 20 meter
		double eindHoogte = -16*Math.pow(tijd, 2) + beginSnelheid * tijd + beginHoogte;
		System.out.print("    "+eindHoogte);
		
		
		double uur = 5;
		double kilometer = 373;
		double kilometerperuur = kilometer / uur;
		System.out.print(" Het gemiddelde is:    "+kilometerperuur);


		
	int kilometerstand = 23340;
	int eindKilometerstand = 23908;
		kilometerstand = eindKilometerstand - kilometerstand;
	double afstandper100km = (double)kilometerstand/100;
	double verbruik = 20;
	double verbruikper100km = verbruik / afstandper100km;
		//585
		System.out.print("Testtt   "+verbruikper100km);
		
	/*
	 * int beginKilometerstand = 23340;
	 * int eindKilometerstand = 23908;
	 * int liter = 20;
	 * double gemiddeldverbruik;
	 * int afstand = eindKilometerstand - beginKilometerstand;
	 * gemiddeldverbruik = (double)liter/afstand * 100;
	 * System.out.println(gemiddeldVerbruik);
	 */
		
		
		double lengte = 3.5;
		int breedte = 5;
		double vierkantemeter = lengte * breedte;
		double vensteropp = vierkantemeter / 100 * 10;
		System.out.println("De oppervlakte is:  " + vensteropp);
		
		
		
	}

}

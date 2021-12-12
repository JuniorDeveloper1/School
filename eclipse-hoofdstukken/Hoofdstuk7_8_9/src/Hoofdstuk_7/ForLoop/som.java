package Hoofdstuk_7.ForLoop;

public class som {
	public static void main(String[] args) {
		int som = 0;
		
	
		for(int i = 4; i < 12; i++ ) {
			System.out.println(i+ "." + " He");
			
		}
		
		for(int i = 1; i < 100; i+=2) {
			som = som + i;
		}
		System.out.println("\n\n" + som);
		//De evengetallen t/m 200
		
	}

}

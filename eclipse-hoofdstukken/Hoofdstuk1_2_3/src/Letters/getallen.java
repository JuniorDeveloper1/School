package Letters;

public class getallen {
	public static void main(String[] args) {
		
		double var = 1;
		
		//Zet iets op een procent
		
		
		//+= vervangt var + ...
		var += var/100 * 5;
		var += var*1.05;
		var += var*0.05;
		
		System.out.println(1 / (2%3));
		
		
		
		// a = 2 , b = 3, c = 4
		
		int a = 2;
		int b = 3;
		int c = 4;
	// (a * b) + c
		System.out.println((a*b) + c);
	//a * (b + c)
		System.out.println( a*(b+c));
	//(1 + b) * c
		System.out.println((1+b)*c);
	//a / c
		System.out.print(a/ c);
		
 //b * (c – a)
		System.out.println(b*(c-a));
		
//5.5% van 20
	System.out.print("a" + 5.5/100 * 20);
	
	}
}

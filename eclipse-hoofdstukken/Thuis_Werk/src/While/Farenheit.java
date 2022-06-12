package While;

public class Farenheit {

public static void main(String[] args) {
	
	int celcius = -40;
	
	while(celcius < 40) {
		
		int farenheit= (int) Math.round((9D/5D) * celcius + 32);
		celcius+= 5;
		
		System.out.println(celcius + "  " +  farenheit);
		}
	//F = (9/5)*C + 32 
	}
}

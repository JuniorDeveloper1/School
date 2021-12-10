package Hoodstuk5.Switch.oefeningen.oef5_2;

public class oef5_2_1 {
	public static void main(String[] args) {
		
		int a = 1;
		int x = 0;
		switch(a) {
	
		case 1: x += 5;
				break;
		case 2: x += 10;
					break;
		case 3: x += 16;
				break;
		case 4: x += 34;
					break;
					
		default: x = 0;
			
		}
	}
}

 /*
  * if (a == 1)
	x += 5;
else if (a == 2)
	x += 10;
else if (a == 3)
	x += 16;
else if (a == 4)
	x += 34;
else
	x = 0;

  */

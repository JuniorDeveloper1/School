package Hoodstuk5.Switch.oefeningen.oef5_1;

public class oef5_1_2 {
	public static void main(String[] args) {
		int a = 3;
		switch(a) {
		case 3: a = 1;
				break;
		case 2:
		case 1: a = 3;
				break;
				
		case 0: a = 2;
				break;
		}
	}
}


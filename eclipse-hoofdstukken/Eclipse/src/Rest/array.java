package Rest;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Hebben we nog niet geleerd.
 */

public class array {
	public static void main(String[] args) {
		List<String> optellen = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		String text1 = scanner.nextLine();
		String text2 = scanner.nextLine();
		String text3 = scanner.nextLine();
		
		optellen.add(text);
		optellen.add(text1);
		optellen.add(text2);
		optellen.add(text3);
		
		for(int i = 0; i < optellen.size(); i++ ) {
			System.out.println(optellen.get(i));
			
		}
	}

}

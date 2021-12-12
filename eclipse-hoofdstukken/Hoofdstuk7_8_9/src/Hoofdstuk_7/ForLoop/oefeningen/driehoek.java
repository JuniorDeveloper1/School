package Hoofdstuk_7.ForLoop.oefeningen;

import java.util.Scanner;

public class driehoek {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = -1;
        int k = 1;
        System.out.println("geef een getal in");
        amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            for (int j = 0 ; j < k ; j--) {
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}

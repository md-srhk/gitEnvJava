package methoden;

import java.util.Scanner;

public class aufgabe5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Bitte n1 eingeben: ");
		double n1 = scanner.nextDouble();
		
		System.out.printf("Bitte n2 eingeben: ");
		double n2 = scanner.nextDouble();
		
		double n3;
		
		/*
		 * n3 = 5
		 * n1 = 2
		 * n2 = 
		 * */
		

		if(n1 > n2) {
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		
		System.out.printf(
				"Die Summe der Zahlen von %.0f bis %.0f lautet: %.0f",
				n1,
				n2,
				summeAllerZahlen(n1, n2)
		);

	}
	
	public static double summeAllerZahlen(double n1, double n2) {
		
		return ((n1 + n2)*(n2 - n1 + 1))/2;
		
	}

}

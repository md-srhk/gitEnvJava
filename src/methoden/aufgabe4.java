package methoden;

import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double valueInCelcius, valueInFahrenheit;
		
		// Get user input
		System.out.printf("Bitte den Celsius-Wert eingeben: ");
		valueInCelcius = scanner.nextDouble();
		
		// Converting
		valueInFahrenheit = fahrenheit(valueInCelcius);
		
		System.out.printf("%.2f Grad Celsius entspricht %.2f Fahrenheit", valueInCelcius, valueInFahrenheit);
		
		scanner.close();

	}
	
	public static double fahrenheit(double celcius) {
		
		return 1.8 * celcius + 32;
		
	}
}

package methoden;

public class aufgabe2 {

	public static void main(String[] args) {
		
		// Initialize variables with functions invoking for e)
		int returnValueForAddition = addition(3, 4);
		int returnValueForSubtraction = subtraktion(3,  4);
		int returnValueForMultiplication = multiplizieren(3, 4);
		double returnValueForDivision = division(8, 4);
		
		// Test the functions through invoking
		
		ausgabeDaten("Klaus", "Maus", 23);
		
		// Print out the results of invocations of the functions for exercise 2 e)
		System.out.printf("Das Ergebnis der Addition lautet: %d%n", returnValueForAddition);
		System.out.printf("Das Ergebnis der Subtraktion lautet: %d%n", returnValueForSubtraction);
		System.out.printf("Das Ergebnis der Multiplikations lautet: %d%n", returnValueForMultiplication);
		System.out.printf("Das Ergebnis der Division lautet: %.2f%n", returnValueForDivision);

	}
	
	// Exercise d)
	public static void ausgabeDaten(String vorname, String nachname, int alter) {
		
		System.out.printf("Die Person heißt %s %s und ist %d Jahre alt.%n", vorname, nachname, alter);
		
	}
	
	// Exercise e)
	
	public static int addition(int wert1, int wert2) {
		
		return wert1 + wert2;
		
	}
	
	public static int subtraktion(int wert1, int wert2) {
		
		return wert1 - wert2;
		
	}
	
	public static int multiplizieren(int wert1, int wert2) {
		
		return wert1 * wert2;
		
	}
	
	public static double division(double wert1, double wert2) {
		
		return wert1 / wert2;
		
	}
}

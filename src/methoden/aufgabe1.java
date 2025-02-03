package methoden;

public class aufgabe1 {

	public static void main(String[] args) {
		
		// Test the functions through invoking
		showMenue();
		wertAusgeben(123);
		mehrereWerteAusgeben(2345, 199);

	}
	
	// Exercise 1 a)
	public static void showMenue() {
		
		System.out.printf(
				  "(A)nzeigen%n"
				+ "(E)ingeben%n"
				+ "(R)echnen%n"
				+ "(B)eenden%n"
		);
	}
	
	// Exercise 1 b)
	public static void wertAusgeben(int parameter1) {
		
		System.out.printf("Der Wert lautet: %d%n", parameter1);
		
	}
	
	// Exercise 1 c)
	public static void mehrereWerteAusgeben(int parameter1, int parameter2) {
		
		System.out.printf(
				  "Der Wert von Parameter1 lautet: %d%n"
				+ "Der Wert von Parameter2 lautet: %d%n",
				parameter1, parameter2
		);
		
	}
	
	

}

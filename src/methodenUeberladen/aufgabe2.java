package methodenUeberladen;

public class aufgabe2 {

	public static void main(String[] args) {
		
		// Test the functions
		
		/*
		 *  Erweiterung 2 mit Zeitmessung mittels System.nanoTime()
		 *  der Funktion zählen(int startwert)
		 */
		
		long time1 = System.nanoTime();
		System.out.printf("Test 1: %n%n"); zählen(2); System.out.printf("%n");
		time1 = System.nanoTime() - time1;
		System.out.printf("Zeitmessung 1: %d%n%n", time1);
		
		/*
		 *  Erweiterung 2 mit Zeitmessung mittels System.nanoTime() der Funktion
		 *  zählenRekursiv(int startwert)
		 */
		long time2 = System.nanoTime();
		System.out.printf("Test 2: %n"); zählenRekursiv(2); System.out.printf("%n");
		time2 = System.nanoTime() - time2;
		System.out.printf("Zeitmessung 2: %d%n%n", time2);
		
		System.out.printf("Test 3: %n"); zählen(0, 10); System.out.printf("%n");
		
		System.out.printf("Test 4: %n"); zählenRekursiv(0, 9); System.out.printf("%n");
			
		System.out.printf("Test 5: %n"); zählen2(0, 9, 0); System.out.printf("%n");
		System.out.printf("Test 6: %n"); zählenRekursiv2(0, 10, 0); System.out.printf("%n");
		
		System.out.printf("Test 7: %n"); zählen2(0, 10, 1); System.out.printf("%n");
		System.out.printf("Test 8: %n"); zählenRekursiv2(0, 10, 1); System.out.printf("%n");
		
		System.out.printf("Test 9: %n"); zählen2(0, 10, 2); System.out.printf("%n");
		System.out.printf("Test 10: %n"); zählenRekursiv2(0, 10, 2); System.out.printf("%n");

	}
	
	public static void zählen(int startwert) {
		
		final int zielwert = 10;
		
		for(int i = startwert; i <= zielwert; i++) {
			
			System.out.printf("Der Wert lautet: %d%n", i);
			
		}
	}
	
	public static void zählenRekursiv(int startwert) {
		
		if(startwert == 10) {
			
			System.out.printf("Der Wert lautet: %d%n", startwert);
			
		} else {
			
			System.out.printf("Der Wert lautet: %d%n", startwert);
			zählenRekursiv(startwert + 1);
			
		}
		
	}
	
	// Erweiterung 2
	
	public static void zählen(int startwert, int zielwert) {
		
		for(int i = startwert; i <= zielwert; i++) {
			
			System.out.printf("Der Wert lautet: %d%n", i);
			
		}
		
	}
	
	public static void zählenRekursiv(int startwert, int zielwert) {
		
		if(startwert == 10) {
			
			System.out.printf("Der Wert lautet: %d%n", startwert);
			
		} else {
			
			System.out.printf("Der Wert lautet: %d%n", startwert);
			zählenRekursiv(startwert + 1);
			
		}
		
	}
	
	// Erweiterung 3
	
	
	public static void zählen2(int startwert, int zielwert, int oddEvenOrAll) {
		
		for(int i = zielwert; i >= startwert; i--) {

			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((i % 2 != 0) ? "Der Wert lautet: %d%n" : "", i); break;
				case 1: System.out.printf((i % 2 == 0) ? "Der Wert lautet: %d%n" : "", i); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", i); break;
				
			}
			
		}
		
	}
	
	public static void zählenRekursiv2(int startwert, int zielwert, int oddEvenOrAll) {
		
		int n = zielwert;
		
		
		if(startwert == zielwert) {
			
			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((n % 2 != 0) ? "Der Wert lautet: %d%n" : "", n); break;
				case 1: System.out.printf((n % 2 == 0) ? "Der Wert lautet: %d%n" : "", n); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", n); break;
			
			}
			
		} else {
			
			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((n % 2 != 0) ? "Der Wert lautet: %d%n" : "", n); break;
				case 1: System.out.printf((n % 2 == 0) ? "Der Wert lautet: %d%n" : "", n); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", n); break;
				
		
			}
			
			zählenRekursiv2(startwert, zielwert - 1, oddEvenOrAll);
			
		}
		
	}
	
}

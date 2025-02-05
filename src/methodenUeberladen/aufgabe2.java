package methodenUeberladen;

public class aufgabe2 {

	public static void main(String[] args) {
		
		System.out.printf("Zeitmessung 1: %d%n%n", System.nanoTime());
		System.out.printf("Test 1: %n%n"); zählen(2); System.out.printf("%n");
		
		System.out.printf("Zeitmessung 2: %d%n", System.nanoTime());
		System.out.printf("Test 2: %n"); zählenRekursiv(5); System.out.printf("%n");
		
		System.out.printf("Test 3: %n"); zählen(0, 10); System.out.printf("%n");
		
		System.out.printf("Test 4: %n"); zählenRekursiv(0, 9); System.out.printf("%n");
			
		System.out.printf("Test 5: %n"); zählen2(0, 9, 0); System.out.printf("%n");
		System.out.printf("Test 6: %n"); zählenRekursiv2(0, 10, 0); System.out.printf("%n");
		
		System.out.printf("Test 7: %n"); zählen2(0, 10, 1); System.out.printf("%n");
		System.out.printf("Test 8: %n"); zählenRekursiv2(0, 10, 1); System.out.printf("%n");
		
		System.out.printf("Test 9: %n"); zählen2(0, 10, 2); System.out.printf("%n");
		System.out.printf("Test 10: %n"); zählenRekursiv2(0, 10, 2); System.out.printf("%n");

	}
	
	// Erweiterung 1
	
	public static void zählen(int startwert) {
		
		int n = startwert;
		final int zielwert = 10;
		
		for(int i = startwert; i <= zielwert; i++) {
			
			System.out.printf("Der Wert lautet: %d%n", n);
			n += 1;
			
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
		
		int n = startwert;
		
		
		for(int i = startwert; i <= zielwert; i++) {
			
			System.out.printf("Der Wert lautet: %d%n", n);
			n += 1;
			
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
		
		int n = startwert;
		
		
		for(int i = startwert; i <= zielwert; i++) {
			
			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((i % 2 != 0) ? "Der Wert lautet: %d%n" : "", i); break;
				case 1: System.out.printf((i % 2 == 0) ? "Der Wert lautet: %d%n" : "", i); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", i); break;
				
				
			}
			
			n += 1;
			
		}
		
	}
	
	public static void zählenRekursiv2(int startwert, int zielwert, int oddEvenOrAll) {
		
		if(startwert == 10) {
			
			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((startwert % 2 != 0) ? "Der Wert lautet: %d%n" : "", startwert); break;
				case 1: System.out.printf((startwert % 2 == 0) ? "Der Wert lautet: %d%n" : "", startwert); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", startwert); break;
			
			}
			
		} else {
			
			switch(oddEvenOrAll) {
			
				case 0: System.out.printf((startwert % 2 != 0) ? "Der Wert lautet: %d%n" : "", startwert); break;
				case 1: System.out.printf((startwert % 2 == 0) ? "Der Wert lautet: %d%n" : "", startwert); break;
				case 2: System.out.printf("Der Wert lautet: %d%n", startwert); break;
				
		
			}
			
			zählenRekursiv2(startwert + 1, zielwert, oddEvenOrAll);
			
		}
		
	}
	
}

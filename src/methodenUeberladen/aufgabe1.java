package methodenUeberladen;

public class aufgabe1 {

	public static void main(String[] args) {
		
		System.out.printf("Test 1: "); zeichneLinie(); System.out.printf("%n");
		System.out.printf("Test 2: "); zeichneLinie(20); System.out.printf("%n");
		System.out.printf("Test 3: "); zeichneLinieCheck(30); System.out.printf("%n");
		System.out.printf("Test 4: "); zeichneLinieCheck(40); System.out.printf("%n");
		System.out.printf("Test 5: "); zeichneLinieCheck2(30, '-'); System.out.printf("%n");
		System.out.printf("Test 6: "); System.out.printf(zeichneLinieCheck2(40, '-') ? null : "Unzulässige Anzahl an Zeichen!");System.out.printf("%n");

	}
	
	public static void zeichneLinie() {
		
		StringBuilder linie = new StringBuilder();
		
		for(int i = 0; i < 20; i++) {
			linie.append('*');
		}
		
		System.out.printf("%s", linie);
		
	}
	
	public static void zeichneLinie(int anzahlDerZeichen) {
		
		StringBuilder linie = new StringBuilder();
		
		for(int i = 0; i < anzahlDerZeichen; i++) {
			linie.append('*');
		}
		
		System.out.printf("%s", linie);
		
	}
	
	public static void zeichneLinieCheck(int anzahlDerZeichen) {
		
		StringBuilder linie = new StringBuilder();
		
		if(anzahlDerZeichen <= 30) {
			
			for(int i = 0; i < anzahlDerZeichen; i++) {
				linie.append('*');
			}
			
			System.out.printf("%s", linie);
			
		} else {
			
			System.out.printf("Unzulässige Anzahl an Zeichen!");
			
		}
		
	}
	
	public static void zeichneLinieCheck(int anzahlDerZeichen, char zeichen) {
		
		StringBuilder linie = new StringBuilder();
		
		if(anzahlDerZeichen <= 30) {
			
			for(int i = 0; i < anzahlDerZeichen; i++) {
				linie.append(zeichen);
			}
			
			System.out.printf("%s", linie);
			
		} else {
			
			System.out.println("Unzulässige Anzahl an Zeichen!");
			
		}
		
	}
	
	public static boolean zeichneLinieCheck2(int anzahlDerZeichen, char zeichen) {
		
		StringBuilder linie = new StringBuilder();
		
		if(anzahlDerZeichen <= 30) {
			
		
			for(int i = 0; i < anzahlDerZeichen; i++) {
				linie.append(zeichen);
			}
			
			System.out.printf("%s", linie);
			
			return true;
			
		} else {
			
			return false;
			
		}
			
	}
	
}

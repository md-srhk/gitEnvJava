package ArrayAufgabe;



public class aufgabe2 {

	public static void main(String[] args) {
		
		int[] anyNumber;
		anyNumber = new int[] {1, 2, 4, 8, 16, 32};
		
		System.out.printf("Without using loop as a control structure%n%n");
		System.out.printf(
				
			"Ausgabe 1. Zahl: %d%n" +
			"Ausgabe 2. Zahl: %d%n" +
			"Ausgabe 3. Zahl: %d%n" +
			"Ausgabe 4. Zahl: %d%n" +	
			"Ausgabe 5. Zahl: %d%n" +
			"Ausgabe 6. Zahl: %d%n",
			
			anyNumber[0], anyNumber[1], anyNumber[2],
			anyNumber[3], anyNumber[4], anyNumber[5]
			
		);
		
		System.out.printf("%n");
		
		System.out.printf("Länge des Arrays %d%n", anyNumber.length);
		
		System.out.printf("%n");
		
		System.out.printf("With for for-loop%n%n");
		for(int i = 0; i < anyNumber.length; i++) {
			
			System.out.printf("Ausgabe %d. Zahl: %d%n", i+1, anyNumber[i]);
			
		}
		
		
		System.out.printf("%n");
		
		System.out.printf("With for foreach-loop%n%n");
		for(int d : anyNumber) {
			
			System.out.printf("Ausgabe Zahl: %d%n", d);
			
		}
		
		System.out.printf("%n");
		
		String[] strings = new String[4];
		
		strings[0] = "Das";
		strings[1] = "ist";
		strings[2] = "ein";
		strings[3] = "Satz";
		
		System.out.printf("With for foreach-loop:" + "\t".repeat(4));
		for(String string: strings) {
			
			System.out.printf(string.equals("Satz") ? "%s!" : "%s ", string);
		}
		
		System.out.printf("%n");
		
		// Alternative approach instead of a foreach-loop
		System.out.printf("With String.join() instead of foreach-loop:\t%s", String.join(" ", strings));
		System.out.printf("!%n");
		

	}

}

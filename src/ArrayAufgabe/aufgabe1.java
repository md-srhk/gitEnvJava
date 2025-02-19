package ArrayAufgabe;

public class aufgabe1 {

	public static void main(String[] args) {
		
		double[] array;
		
		array = new double[] {2.7, 3, 12.54};
		
		System.out.printf(
				
			"Ausgabe Zahl: %.1f%n" +
			"Ausgabe Zahl: %.1f%n" +
			"Ausgabe Zahl: %.2f%n"
					
		, array[0], array[1], array[2]);
		
		System.out.printf("%n");
		
		System.out.printf("Länge des Arrays: %d%n", array.length);
		
		System.out.printf("%n");
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.printf(i==2 ? "%.2f " : "%.1f ", array[i]);
		}
		
		System.out.printf("%n%n");
		
		for (double d : array) {
			
			System.out.printf(d==12.54 ? "%.2f " : "%.1f ", d);
		}

	}

}

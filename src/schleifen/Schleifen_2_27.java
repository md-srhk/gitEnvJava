package schleifen;
import java.util.Scanner;
public class Schleifen_2_27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.27 Einfache for-Schleifen 2
		 */
		
		int numberOfIterations;
		
		System.out.print("Bitte die Anzahl der Durchläufe eingeben: ");
		numberOfIterations = scanner.nextInt();
		for(int i = 0; i < numberOfIterations; i++) {
			System.out.println("Das geht...");
		}
		
		System.out.print("Bitte die Anzahl der Durchläufe eingeben: ");
		numberOfIterations = scanner.nextInt();
		for(int i = 0; i < numberOfIterations; i++) {
			System.out.println(i + 1);
		}
		
		System.out.print("Bitte die Anzahl der Durchläufe eingeben: ");
		numberOfIterations = scanner.nextInt();
		for(int i = 0; i < numberOfIterations; i++) {
			System.out.println((i + 3) * 2);
		}
		
		
		System.out.print("Bitte die Anzahl der Durchläufe eingeben: ");
		numberOfIterations = scanner.nextInt();
		for(int i = numberOfIterations; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		// Mistake
		System.out.print("Bitte die Anzahl der Durchläufe eingeben: ");
		numberOfIterations = scanner.nextInt();
		for(int i = 1; i < numberOfIterations; i++) {
			
			System.out.println(i);
			
			if(i >= 2) {
				
				System.out.println("Schleife wird abgebrochen!");
				break;
				
			}
			
		}
		
		int startOfTheIteration, endOfTheIteration;
		String givenStringForLoop;
		
		System.out.print("Bitte Startwert der Schleife eingeben: ");
		startOfTheIteration = scanner.nextInt();
		
		System.out.print("Bitte Endwert der Schleife eingeben: ");
		endOfTheIteration = scanner.nextInt();
		
		if(startOfTheIteration < endOfTheIteration) {
			
			for(int i = startOfTheIteration; i <= endOfTheIteration; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			
			for(int i = startOfTheIteration; i >= endOfTheIteration; i--) {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println();
		
		System.out.print("Bitte Startwert der Schleife eingeben: ");
		startOfTheIteration = scanner.nextInt();
		
		System.out.print("Bitte Endwert der Schleife eingeben: ");
		endOfTheIteration = scanner.nextInt();
		
		System.out.print("Bitte Ausgabestring eingeben: ");
		givenStringForLoop = scanner.next();
		
		if(startOfTheIteration < endOfTheIteration) {
			
			for(int i = startOfTheIteration; i <= endOfTheIteration; i++) {
				System.out.print(givenStringForLoop + " ");
			}
			
		} else {
			
			for(int i = endOfTheIteration; i >= startOfTheIteration; i--) {
				System.out.print(givenStringForLoop + " ");
			}
			
		}
		
		System.out.println();
		
		System.out.print("Bitte Startwert der Schleife eingeben: ");
		startOfTheIteration = scanner.nextInt();
		
		System.out.print("Bitte Endwert der Schleife eingeben: ");
		endOfTheIteration = scanner.nextInt();
		
		System.out.print("Bitte Ausgabestring eingeben: ");
		givenStringForLoop = scanner.next();
		
		for(int i = 1; i <= givenStringForLoop.length(); i++) {
			
			System.out.println("Der String hat " + i + " Zeichen." );
			
		}
	}
	
	

}

package schleifen;
import java.util.Scanner;
public class Schleifen_2_30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.30 for-Schleifen (Aufgabe 2) * 
		 */
		
		int start, end;
		int sum = 0;
		
		System.out.println("Berechnung der Summe von Zahl1 bis Zahl2");
		
		System.out.print("Eingabe Zahl1: ");
		start = scanner.nextInt();
		
		System.out.print("Eingabe Zahl1: ");
		end = scanner.nextInt();
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.printf("Die Summe aller Zahlen von %d bis %d ergibt %d", start, end, sum);
	}
	
	

}

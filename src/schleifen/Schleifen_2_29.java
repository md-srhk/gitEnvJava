package schleifen;
import java.util.Scanner;
public class Schleifen_2_29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.29 for-Schleifen (Aufgabe 1)
		 */
		
		int n;
		int faculty = 1;
		
		System.out.println("Fakultät berechnen");
		System.out.print("Eingabe Zahl: ");
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			faculty *= i;
		}
		
		System.out.printf("Die Fakultät von %d ist %d", n, faculty);
	}
	
	

}

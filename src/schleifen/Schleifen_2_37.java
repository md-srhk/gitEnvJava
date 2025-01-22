package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_37 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.37 while-Schleifen (Aufgabe 2) **
		 */
		 
		for(int y = 1; y <= 10; y++) {
			
			for(int x = 1; x <= 10; x++) {
				
				System.out.printf("%4d", (x * y));
				
			}
			
			System.out.println();
			
		}
		
	}
	
}

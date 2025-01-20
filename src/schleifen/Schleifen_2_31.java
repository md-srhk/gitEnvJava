package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_31 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.31 for-Schleifen (Aufgabe 3) ** 
		 */
		
		int obergrenze = 0, untergrenze = 100;
		for(int i = 0; i < 10; i++) {
			
			System.out.println((int) (Math.random() * (obergrenze - untergrenze + 1) + untergrenze));
			
		}
		
		obergrenze = -50; untergrenze = 50;
		for(int i = 0; i < 5; i++) {
			
			System.out.println((int) (Math.random() * (obergrenze - untergrenze + 1) + untergrenze));
			
		}
	
	}

}

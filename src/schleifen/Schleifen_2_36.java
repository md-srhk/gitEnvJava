package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_36 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.36 while-Schleifen (Aufgabe 1) *
		 */
		
		int start = 1;
		int end = 10;
		
		int i = start;
		int numberOfIterations = end - start;
		
		while(i < start + numberOfIterations + 1) {
			
			System.out.println(i);
			i++;
			
		}
		
		start = 1;
		end = 10;
		
		i = start;
		numberOfIterations = end - start;
		
		while(i < start + numberOfIterations + 1) {
		  
			System.out.println("Hallo Welt");
			
			if(i == 5) {
				
				break;
				
			}
			
			i++;
		  
		}
		 
		
		
	}

}
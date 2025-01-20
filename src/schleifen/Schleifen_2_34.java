package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_34 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.34 for-Schleifen (Aufgabe 3) ** 
		 */
		
		
		// a)
		
		{
			int i = 0;
			while(i < 10) {
				System.out.print("Hallo ");
				i++;
			}
			System.out.println("");
		}
		
		// b)
		
		{
			
			int i = 0;
			int numberOfIterations = 10;
			
			while(i < numberOfIterations + 1) {
				System.out.print(i + " ");
				i++;
			}
			
			System.out.println("");
			
		}
		// c)
		
		{
			int i = 1;
			int numberOfIterations = 10;
			
			while(i < numberOfIterations + 1) {
				System.out.print(i + " Hallo ");
				i++;
			}
			
			System.out.println("");
			
		}
		
		// d)
		
		{
			int i = 8;
			while(i >= 0) {
				System.out.print(i + " ");
				i--;
			}
			System.out.println("");
		}
		
		// e)
		
		{
			
			int i = 1;
			int numberOfIterations = 1000;
			while(i < numberOfIterations + 1) {
				
				System.out.print(i + " ");
				
				if(i == 5) {
					break;
				}
				
				i++;
			}
			System.out.println("");
		}
		
		// f)
		
		{
			
			int start = 3;
			int end = 12;
			
			int i = start;
			int numberOfIterations = end - start;
			
			while(i < start + numberOfIterations + 1) {
				
				if(i == 6 || i == 9) {
					i++;
					continue;
				}
				
				System.out.print(i + " ");
				
				i++;
				
			}
			System.out.println("");
		}
		
		
	}

}
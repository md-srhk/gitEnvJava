package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.33 for-Schleife (Aufgabe 5) ***
		 */
		
		String Variable1 = "Guten Morgen liebe Sorgen!";
		String Variable2 = "liebe";
		
		int startLine = Variable1.indexOf(Variable2);
		int endLine = startLine + Variable2.length();
		
		System.out.println(Variable1);
		for(int i = 0; i < startLine; i++) {
			System.out.print(" ");
		}
		
		for(int i = startLine; i < endLine; i++) {
			System.out.print("-");
		}
		
		
		
		
		
	}

}
package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_38 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.38 while-Schleifen (Aufgabe 3) *** 
		 */
		 
		String Variable1 = "Guten Morgen liebe Sorgen!";
		String Variable2 = "orgen";
		
		int i = 0;
		
		int startLine = Variable1.substring(i).indexOf(Variable2);
		int endLine = startLine + Variable2.substring(i).length();
		
		boolean Variable1IncludesVariable2 = Variable1.substring(i).indexOf(Variable2) != -1;
		
		System.out.println(Variable1);
		
		while(Variable1IncludesVariable2) {
			
			while(i < startLine) {
				
				System.out.print(" ");
				i++;
			}
			
			while(i < endLine) {
				
				System.out.print("-");
				i++;
			}
			
			if(i > Variable1.length() - 1) {
				break;
			}
			
			startLine = Variable1.substring(i).indexOf(Variable2);
			endLine = startLine + Variable2.substring(i).length();
			
			Variable1IncludesVariable2 = Variable1.substring(i).indexOf(Variable2) != -1;
		}
	}
	
}

//package schleifen;
//import java.util.Scanner;
//import java.lang.Math;
//public class Schleifen_2_33 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		/*
//		 2.33 for-Schleife (Aufgabe 5) ***
//		 */
//		
//		String Variable1 = "Guten Morgen liebe Sorgen!";
//		String Variable2 = "liebe";
//		
//		int startLine = Variable1.indexOf(Variable2);
//		int endLine = startLine + Variable2.length();
//		
//		System.out.println(Variable1);
//		for(int i = 0; i < startLine; i++) {
//			System.out.print(" ");
//		}
//		
//		for(int i = startLine; i < endLine; i++) {
//			System.out.print("-");
//		}
//		
//		
//		
//		
//		
//	}
//
//}
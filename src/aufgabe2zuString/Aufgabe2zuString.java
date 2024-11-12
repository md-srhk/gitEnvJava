package aufgabe2zuString;

public class Aufgabe2zuString {
	
	public static void main(String[] args) {
		{
			
			System.out.println("Aufgabe 1\n");
			
			String s1 ="Hallo";
			String s2 = s1 + " Leute";
			String s3 = "\tJA\u0020und\u0020NEIN!";

			System.out.println("s1: " + s1);
			System.out.println("s2: " + s2);
			System.out.println("s3: " + s3);
			String s4 = "Werte: " + 3 + 4;
		 	String s5 = "Werte: " + (3+4);
		 	
		 	System.out.println("s4: " + s4);
		 	System.out.println("s5: " + s5);
		 	
		 	/* Ausgabe
		 	 * s1: Hallo
		 	 * s2: Hallo Leute
		 	 * s3: 	JA und NEIN!
		 	 * s4: Werte: 34
		 	 * s5: Werte: 7
		 	 * */

		}
		
		{
			
			System.out.println("Aufgabe 2\n");
			
			String str1 = "Guten Morgen";
			System.out.println("Mein String: " + str1);
			System.out.println("Länge: " + str1.length() + " Zeichen");
			
			str1 += " liebe Schüler!";
			System.out.println("Mein String: " + str1);
			System.out.println("Länge: " + str1.length() + " Zeichen");
			
			System.out.println("Enthält das Wort 'liebe': " + str1.contains(str1));
			
			System.out.println("Index des ersten 'n': " + str1.indexOf('n'));
			
			String str2 = "Guten Morgen";
			System.out.println("String Vergleich: " + str1.equals(str2));
			
		}
	}
	
}

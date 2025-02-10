package methodenUeberladen;

import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		zeigeLange(text);

	}
	
	public static void zeigeLange(String stringZumPrufen) {
		
		
		System.out.printf(
				
			"Der String lautet: %s%n",
			stringZumPrufen
			
		);
		
		int nForSentence = 0;
		int nForWord = 0;
		
		do {
			if(stringZumPrufen.charAt(nForSentence) == ' ') {
				
				System.out.printf(
					"Das Wort hat die Länge: %d%n",
					nForWord
				);
				
				nForWord = 0;
				
			} else {
				
				nForWord++;
				
			}
			
			nForSentence++;
			
		} while(nForSentence < stringZumPrufen.length());
	}

}

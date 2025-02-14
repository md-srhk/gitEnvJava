package methodenUeberladen;

import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Der String lautet: ");
		String text = scanner.nextLine();
		
		zeigeLange(text);
		
		scanner.close();

	}
	
	public static void zeigeLange(String stringZumPrufen) {
		
		
		System.out.printf(
				
			"Der String lautet: %s%n",
			stringZumPrufen
			
		);
		
		int nForSentence = 0;
		int nForWord = 0;
		
		boolean currentCharacterIsASpace, isLastCharacter;
		
		do {
			
			currentCharacterIsASpace = (stringZumPrufen.charAt(nForWord)) == ' ';
			isLastCharacter = nForSentence >= (stringZumPrufen.length() - 1);
			
			if(currentCharacterIsASpace) {
				
				System.out.printf(
						
					"Das Wort hat die Länge: %d%n",
					nForWord
					
				);
				
				nForWord = 0;
				
			} else  if (isLastCharacter){
				
				nForWord++;
				
				System.out.printf(
						
					"Das Wort hat die Länge: %d%n",
					nForWord
					
				);
				
			} else {
				
				nForWord++;
				
			}
			
			nForSentence++;
			
			if(nForSentence == (stringZumPrufen.length())) {
				
				break;
			}
			
		} while(nForSentence < stringZumPrufen.length());
	}

}

package methodenUeberladen;

import java.util.Scanner;

public class aufgabe3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("String zum analysieren: ");
		String name = scanner.nextLine();
		
		System.out.printf("Zu suchendes Zeichen: ");
		char searchChar = scanner.nextLine().charAt(0);
		
		
		System.out.printf(
			"Methode 1: Es wurde %d '%s' gefunden.%n",
			numberOfCharacters(name, searchChar),
			searchChar
		);
		
		System.out.printf(
			"Methode 2: Es wurde %d '%s' gefunden.%n",
			numberOfCharactersRecursive(name, searchChar),
			searchChar
		);

	}
	
	static public int numberOfCharacters(String stringToSearch, char searchChar) {
		
		int n = 0;
		
		for(int i = 0; i < stringToSearch.length(); i++) {
			
			if(stringToSearch.charAt(i) == searchChar) {
				
				n++;
				
			}
			
		}
		
		return n;
		
	}
	
	static public int numberOfCharactersRecursive(String stringToSearch, char searchChar) {
		
		if(stringToSearch.length() == 0) {
			
			return 0;
			
		} else {
			
			String newString = stringToSearch.substring(0, stringToSearch.length() - 1);
			
			if(stringToSearch.indexOf(stringToSearch.length() - 1) == searchChar) {
				
				return 1 + numberOfCharacters(newString, searchChar);
				
			} else {
				
				return numberOfCharacters(newString, searchChar);
				
			}
		}
		
	}

}

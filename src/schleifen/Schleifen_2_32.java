package schleifen;
import java.util.Scanner;
import java.lang.Math;
public class Schleifen_2_32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 2.32 for-Schleifen (Aufgabe 3) ** 
		 */
		
		String password, repeatedPassword;
		
		
		System.out.print("Bitte geben Sie Ihr neues Passwort ein: ");
		password = scanner.nextLine();
		
		System.out.print("Bitte geben Sie Ihr neues Passwort noch einmal ein: ");
		repeatedPassword = scanner.nextLine();
		
		if(!password.equals(repeatedPassword)) {
			
			System.out.print("Die Passwörter sind nicht identisch");
			
		} else if (password.length() < 7 || password.length() > 15) {
			
			System.out.print("Das Passwort muss 7 bis 15 Zeichen lang sein");
			
		} else if(password.contains("@") || password.contains("/") || password.contains("?")){
			
			System.out.println("Die folgenden Zeichen sind nicht erlaubt: / @ ?");
			
		} else {
			
			String numbers = "0123456789";
			boolean containNumericalValue = false;
			for(int iOfCharacters = 0; iOfCharacters < password.length(); iOfCharacters++) {
				for(int iOfNumbers = 0; iOfNumbers < numbers.length(); iOfNumbers++) {
					if(password.charAt(iOfCharacters) == numbers.charAt(iOfNumbers)) {
						containNumericalValue = true;
					}
				}
			}
			
			if(containNumericalValue) {
				
				System.out.println("Das eingegebene Passwort ist gültig!");
				
			} else {
				
				System.out.println("Es müssen Zahlen im Password enthalten sein.");
				 
			}
		}
	}

}
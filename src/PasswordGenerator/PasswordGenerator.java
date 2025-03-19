
package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
		
		int passwordLength = 0; // Variable to store the length of the password
		
		String userInput;
		boolean isUserInputANumber;
		boolean userWantsToExit = false;
		boolean onlyUseLetters = false;
		
		System.out.printf(
				"Program to generate a password and evaluate its strength%n" +
				"%n"
		);
		
		while(true) { // Infinite loop until the user decides to exit
			
			System.out.printf("Passwort-Generator%n");
			passwordLength = askUserForLength(scanner);
			onlyUseLetters = askUserToUseOnlyLetters(scanner);
			
			generateAndEvalualtePassword(passwordLength, onlyUseLetters);
			
			if(askIfUserWantToExitTheProgram(scanner)) {
				
				break; // Exit the loop if user chooses "yes"
				
			} else {
				
				System.out.printf("%n");
			}
		}
		
		
		scanner.close(); // Close the scanner object
	}
	
	public static int askUserForLength(Scanner scanner) {
	
		String userInput;
		boolean isUserInputANumber = true; // Assume the input is a number
		int passwordLength = 0;
		
		do {
			
			System.out.printf("Length of password: ");
			
			
			userInput = scanner.nextLine(); // Read user input
			
			for(int i = 0; i < userInput.length(); i++) {
				
				if(!(isANumber(userInput.charAt(i)))) { // Check if input contains only numbers
					
					isUserInputANumber = false;
					System.out.printf("Error: Wrong input! User input should be numerical!%n");
					break;
					
				}
				
			}
			
			if(isUserInputANumber) {
				
				passwordLength = Integer.parseInt(userInput); // Convert input to integer
				
			}
			
			if ((passwordLength < 6) && isUserInputANumber) {
				
				System.out.printf("Error: Wrong input! Password length must be at least 6.%n");
			}
			
		} while(!(isUserInputANumber) || passwordLength < 6); // Repeat until a valid input is given
		
		return passwordLength;
		
	}
	
	public static boolean askUserToUseOnlyLetters(Scanner scanner) {
		
		String userInput;
		
		do {
			
			System.out.printf("Should only letters should be used (yes/no): ");
			userInput = scanner.nextLine().toLowerCase();
			
		} while ((!userInput.equals("yes")) && (!userInput.equals("no"))); // Repeat until valid input
		
		return userInput.equals("yes");
		
	}
	
	public static void generateAndEvalualtePassword(int passwordLength, boolean onlyUseLetters) {
		
		String generatedPassword;
		
		System.out.printf("%n%n");
		generatedPassword = generatePassword(passwordLength, onlyUseLetters); // Generate password with only letters
		System.out.printf("Generated password: %s%n" , generatedPassword);
		System.out.printf("%n");
		getPasswordStrength(generatedPassword);
		
	}
	
	public static boolean askIfUserWantToExitTheProgram(Scanner scanner) {
		
		String userInput;
		
		do {
			
			System.out.printf("%n".repeat(3)); // Print three empty lines
			System.out.printf("Do you want to exit the program (yes/no): ");
			userInput = scanner.nextLine();
			
		} while ((!userInput.equals("yes")) && (!userInput.equals("no"))); // Repeat until valid input
		
		return userInput.equals("yes");
		
	}
	
	public static String generatePassword(int length) {
		
		String returnValue = "";
		
		Random random = new Random(); // Create a Random object
		
		for(int i = 0; i < length; i++) {
			
			returnValue += (char) (32 + random.nextInt(94)); // Generate random ASCII character
			
		}
		
		return returnValue;
	}
	
	public static String generatePassword(int length, boolean justCharacters) {
		
		String returnValue = "";
		
		Random random = new Random();
		
		for(int i = 0; i < length; i++) {
			
			if(justCharacters) {
				
				if(random.nextBoolean()) {
					
					returnValue += (char) (65 + random.nextInt(25)); // Generate uppercase letter
					
				} else {
					
					returnValue += (char) (97 + random.nextInt(25)); // Generate lowercase letter
					
				}
				
			} else {
				
				returnValue += (char) (32 + random.nextInt(94));
				
			}
			
		}
		
		return returnValue;
	}
	
	public static int getPasswordStrength(String password) {
		
		
		String output, tableLine;
		final int tableSize = 40;
		
		int passwordStrength;
		
		boolean hasASpecialCharacter = false;
		boolean hasAUppercaseCharacter = false;
		boolean hasALowerCaseCharacter = false;
		boolean hasANumber = false;
		boolean hasLessThan6Characters = password.length() < 6;
		
		output = getOutput(tableSize, "Password strength of", password);
		tableLine = getTableLine(tableSize, output);
		
		printTableLine(tableLine);
		printOutput(output);
		printTableLine(tableLine);
		
		
		for(int i = 0; i < password.length(); i++) {
			
			char currentCharacter = password.charAt(i);
		
			hasAUppercaseCharacter = isUppercase(currentCharacter) ? true : hasAUppercaseCharacter;
			hasALowerCaseCharacter =  isLowercase(currentCharacter) ? true : hasALowerCaseCharacter;
			hasANumber = isANumber(currentCharacter) ? true : hasANumber;
			hasASpecialCharacter = 
					!(
							isUppercase(currentCharacter) ||
							isLowercase(currentCharacter) ||
							isANumber(currentCharacter) ||
							currentCharacter == 32
					) ? true: hasASpecialCharacter;
		}
		
		printOutput(getOutput(tableSize, "Has uppercase characters", hasAUppercaseCharacter ? "yes" : "no"));
		printOutput(getOutput(tableSize, "Has lowercase characters", hasALowerCaseCharacter? "yes" : "no"));
		printOutput(getOutput(tableSize, "Has numbers", hasANumber ? "yes" : "no"));
		printOutput(getOutput(tableSize, "Has special characters", hasASpecialCharacter ? "yes" : "no"));
		printOutput(getOutput(tableSize, "Has less than 6 characters", hasLessThan6Characters ? "yes" : "no"));
		printTableLine(tableLine);
		
		return 0;
	}
	
	// Checks if a character is an uppercase letter
	public static boolean isUppercase(char c) {return c >= 65 && c <= 90;}
	
	// Checks if a character is a lowercase letter
	public static boolean isLowercase(char c) {return c >= 97 && c <= 122;}
	
	// Checks if a character is a numerical digit
	public static boolean isANumber(char c) {return c >= 48 && c <= 57;}
	
	// Formats an output string with a key-value pair, ensuring minimum width
	public static String getOutput(int minTableWidth, String key, String value){
		
		String returnValue = key + ": " + value;
		
		if((minTableWidth - returnValue.length()) > 0) {
			
			returnValue += " ".repeat(minTableWidth - returnValue.length());
			
		}
		
		return returnValue;
		
	}
	
	// Generates a table line with a minimum width requirement
	public static String getTableLine(int minTableWidth, String output) {
		
		String returnValue = "-".repeat(output.length() + 2);
		
		if((minTableWidth - returnValue.length()) > 0) {
			
			returnValue += " ".repeat(minTableWidth - returnValue.length());
			
		}
		
		return returnValue;
		
	}
	
	// Prints formatted output within table formatting
	public static void printOutput(String output) {
		
		System.out.printf("-"+ output + "-%n");
		
	}
	
	// Prints a table line
	public static void printTableLine(String tableLine) {
		
		System.out.printf(tableLine + "%n");
		
	}
	
}


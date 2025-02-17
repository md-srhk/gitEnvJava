package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int passwordLength = 0;
		
		String userInput;
		boolean isUserInputANumber;
		boolean userWantsToExit = false;
		
		while(true) {
			
			System.out.printf(
					"Program to generate a password and evaluate its strength%n" +
					"%n"
			);
			
			do {
				
				System.out.printf("Passwort-Generator%n");
				System.out.printf("Length of password: ");
				
				isUserInputANumber = true;
				
				userInput = scanner.nextLine();
				
				for(int i = 0; i < userInput.length(); i++) {
					
					if(!(isANumber(userInput.charAt(i)))) {
						
						isUserInputANumber = false;
						System.out.printf("Wrong input! User input should be numerical!%n%n");
						break;
						
					}
					
				}
				
				if(isUserInputANumber) {
					
					passwordLength = Integer.parseInt(userInput);
					
				}
				
				if ((passwordLength < 6) && isUserInputANumber) {
					
					System.out.printf("Wrong input! Password length must be at least 6.%n%n");
				}
				
			} while(!(isUserInputANumber) || passwordLength < 6);
			
			System.out.printf("%n%n");
			
			String generatedPassword = generatePassword(passwordLength);
			
			System.out.printf("%n");
			
			System.out.printf("Generated password: %s%n" , generatedPassword);
			getPasswordStrength(generatedPassword);
			
			System.out.printf("%n%n");
			
			generatedPassword = generatePassword(passwordLength, true);
			
			System.out.printf("%n");
			
			System.out.printf("Generated password: %s%n" , generatedPassword);
			getPasswordStrength(generatedPassword);
			
			do {
				
				System.out.printf("Do you want to exit the program (yes/no): ");
				userInput = scanner.nextLine();
				
			} while ((userInput != "yes") || (userInput != "false"));
			
			if(userInput == "yes") {
				
				break;
				
			}
		}
		
		
		scanner.close();
	}
	
	public static String generatePassword(int length) {
		
		String returnValue = "";
		
		Random random = new Random();
		
		for(int i = 0; i < length; i++) {
			
			returnValue += (char) (32 + random.nextInt(94));
			
		}
		
		return returnValue;
	}
	
public static String generatePassword(int length, boolean justCharacters) {
		
		String returnValue = "";
		
		Random random = new Random();
		
		for(int i = 0; i < length; i++) {
			
			if(justCharacters) {
				
				if(random.nextBoolean()) {
					
					returnValue += (char) (65 + random.nextInt(25));
					
				} else {
					
					returnValue += (char) (97 + random.nextInt(25));
					
				}
				
			} else {
				
				returnValue += (char) (32 + random.nextInt(94));
				
			}
			
		}
		
		return returnValue;
	}
	
	public static int getPasswordStrength(String password) {
		
		Scanner scanner = new Scanner(System.in);
		
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
		
		scanner.close();
		
		return 0;
	}
	
	public static boolean isUppercase(char c) {return c >= 65 && c <= 90;}
	public static boolean isLowercase(char c) {return c >= 97 && c <= 122;}
	public static boolean isANumber(char c) {return c >= 48 && c <= 57;}
	
	public static String getOutput(int minTableWidth, String key, String value){
		
		String returnValue = key + ": " + value;
		
		if((minTableWidth - returnValue.length()) > 0) {
			
			returnValue += " ".repeat(minTableWidth - returnValue.length());
			
		}
		
		return returnValue;
		
	}
	
	public static String getTableLine(int minTableWidth, String output) {
		
		String returnValue = "-".repeat(output.length() + 2);
		
		if((minTableWidth - returnValue.length()) > 0) {
			
			returnValue += " ".repeat(minTableWidth - returnValue.length());
			
		}
		
		return returnValue;
		
	}
	
	public static void printOutput(String output) {
		
		System.out.printf("-"+ output + "-%n");
		
	}
	public static void printTableLine(String tableLine) {
		
		System.out.printf(tableLine + "%n");
		
	}

}

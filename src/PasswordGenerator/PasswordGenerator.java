package PasswordGenerator;

import java.util.Scanner;

public class PasswordGenerator {
	


	public static void main(String[] args) {
		
		getPasswordStrength("test");

	}
	
	public static int getPasswordStrength(String password) {
		
		Scanner scanner = new Scanner(System.in);
		String output, tableLine;
		
		int passwordStrength;
		
		boolean hasASpecialCharacter = false;
		boolean hasAUppercaseCharacter = false;
		boolean hasALowerCaseCharacter = false;
		boolean hasANumber = false;
		boolean hasLessThan6Characters = password.length() < 6;
		
		output = getOutput(30, "Password strength of", password);
		tableLine = getTableLine(30, output);
		
		printTableLine(tableLine);
		printOutput(output);
		printTableLine(tableLine);
		
		
		for(int i = 0; i < password.length(); i++) {
			
			char currentCharacter = password.charAt(i);
	
			hasAUppercaseCharacter = isUppercase(currentCharacter) ? true : hasAUppercaseCharacter;
			hasALowerCaseCharacter =  isLowercase(currentCharacter) ? true : hasALowerCaseCharacter;
			hasANumber = isANumber(currentCharacter) ? true : hasANumber;
			
		}
		
		
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
		
		System.out.printf(output + "%n");
		
	}
	public static void printTableLine(String tableLine) {
		
		System.out.printf(tableLine + "%n");
		
	}

}

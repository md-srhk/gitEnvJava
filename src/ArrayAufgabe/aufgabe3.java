package ArrayAufgabe;

import java.util.Scanner;

public class aufgabe3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
		int lengthOfArray; // Variable to store the length of the array
		int[] array; // Array to store user input values
		String userInput; // Variable to store user input as a string
		
		// Title
		System.out.printf("Program that return the input values backwards%n%n");
		
		// Loop until a valid numerical input is provided
		do {
			
			System.out.printf("Please give me the amount of elements: ");
			userInput = scanner.nextLine(); // Read user input
			
		} while (!stringIsANumber(userInput)); // Repeat if input is not a number
		
		lengthOfArray = Integer.parseInt(userInput); // Convert string input to integer
		
		array = new int[lengthOfArray]; // Initialize the array with the given length
		
		// Loop to get values for the array
		for(int i = 0; i < array.length; i++) {
			
			do {
				
				System.out.printf("Give me a number: ");
				userInput = scanner.nextLine(); // Read user input
				
			} while (!stringIsANumber(userInput)); // Repeat if input is not a number
			
			array[i] = Integer.parseInt(userInput); // Convert input to integer and store it
			
		}
		
		// Output the numbers in reverse order
		System.out.printf("The numbers in the backwards order:");
		for(int i = array.length - 1; i >= 0; i--) {
			
			// Print each number, adding a comma except for the last one
			System.out.printf("%s%s", array[i], i==0?"":", ");
			
		}
	}
	
	// Method to check if a character is a number
	public static boolean charIsANumber(char c) {return c >= 48 && c <= 57;}
	
	// Method to check if a string consists only of numeric characters
	public static boolean stringIsANumber(String s) {
		
		boolean isANumber = true;
		
		for(int i = 0; i < s.length(); i++) {
			
			isANumber = charIsANumber(s.charAt(i)) ? isANumber : false;
			
		}
		
		return isANumber;
	}

}

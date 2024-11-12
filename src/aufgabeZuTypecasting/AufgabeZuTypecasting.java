package aufgabeZuTypecasting;

import java.util.Scanner;

public class AufgabeZuTypecasting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		String str1 = "1234";
//		String str2 = "5678";
		
		System.out.print("Zahl1: ");
		String str1 = scanner.next();
		
		System.out.print("Zahl2: ");
		String str2 =  scanner.next();
		
		scanner.close();
		
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println("Summe: " + sum);
		
		byte myByteValue = 111;
		short myShortValue = 111;
		int myIntValue = 111;
		long myLongValue = 111;
		float myFloatValue = 111.11f;
		double myDoubleValue = 111.11d;
		
		myShortValue = myByteValue;
		myIntValue = myByteValue;
		myLongValue = myByteValue;
		myFloatValue = myByteValue;
		myDoubleValue = myByteValue;
		
		myByteValue =  (byte) myShortValue;
		myIntValue = (int) myShortValue;
		myLongValue = myShortValue;
		myFloatValue = myShortValue;
		myDoubleValue = myShortValue;
		
		myByteValue =  (byte) myIntValue;
		myShortValue = (short) myIntValue;
		myLongValue = myIntValue;
		myFloatValue = myIntValue;
		myDoubleValue = myIntValue;
		
		myByteValue =  (byte) myLongValue;
		myShortValue = (short) myLongValue;
		myIntValue = (int) myLongValue;
		myFloatValue = myLongValue;
		myDoubleValue = myLongValue;
		
		myByteValue =  (byte) myFloatValue;
		myShortValue = (short) myFloatValue;
		myIntValue = (int) myFloatValue;
		myLongValue = (long) myFloatValue;
		myDoubleValue = myFloatValue;
		
		myByteValue =  (byte) myDoubleValue;
		myShortValue = (short) myDoubleValue;
		myIntValue = (int) myDoubleValue;
		myLongValue = (long) myDoubleValue;
		myFloatValue = (float) myDoubleValue;
		
		System.out.println(myByteValue);
		System.out.println(myShortValue);
		System.out.println(myIntValue);
		System.out.println(myShortValue);
		System.out.println(myLongValue);
		System.out.println(myFloatValue);
		System.out.println(myDoubleValue);
	}

}

package gitEnv;

import helloWorldPackage.*;
import java.util.Scanner;

import aufgabe1zuString.Aufgabe1zuString;
import aufgabe2zuString.Aufgabe2zuString;
import aufgabeZuTypecasting.AufgabeZuTypecasting;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		String[] listOfPrograms = {
				"Hello World!",
				"String1",
				"String2",
				"Typecasting"
				};
		
		System.out.println("Welches Programm soll ausgeführt werden?");
		
		for(int i = 0; i < listOfPrograms.length; i++) {
			
			System.out.println("[" + i + "] " + listOfPrograms[i]);
			
		}
		
		System.out.print("[0 - " + (listOfPrograms.length-1) + "] ");
		choice = scanner.nextInt();
		System.out.println();
		
		System.out.println("Ausführung von " + listOfPrograms[choice]);
		System.out.println();
		switch(choice) {
			case 0: HelloWorld.main(null); break;
			case 1: Aufgabe1zuString.main(null); break;
			case 2: Aufgabe2zuString.main(null); break;
			case 3: AufgabeZuTypecasting.main(null); break;
		}
		
		
		
		

	}

}

package KlasseMathUndRandom;

import java.lang.Math;
import java.util.Random;

public class KlasseMathUndRandom {

	public static void main(String[] args) {
		
		System.out.printf(
				"Generierung von Zufallszahlen von den Zahlen 1 bis 6 eines 6-seitigen Würfels%n"
				+ "Die Klasse Math wird verwendet.%n"
		);
		for(int i = 0; i < 3; i++) {
			
			System.out.printf("Die Zahl %d ist gewürfelt worden.%n", (int) (Math.random() * 6 + 1));
			
		}
		
		Random rand = new Random();
		
		System.out.printf(
				"Generierung von Zufallszahlen von den Zahlen 1 bis 6 eines 6-seitigen Würfels%n"
				+ "Die Klasse Random wird verwendet.%n"
		);
		for(int i = 0; i < 3; i++) {
			
			System.out.printf("Die Zahl %d ist gewürfelt worden.%n", rand.nextInt(1, 7));
			
		}
		
	}

}

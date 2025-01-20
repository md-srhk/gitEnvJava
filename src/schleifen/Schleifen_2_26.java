package schleifen;
import java.util.Scanner;
public class Schleifen_2_26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.26 Einfache for-Schleifen
		 * */
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Hallo");
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= 20; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
			if(i == 50) {
				break;
			}
		}
		
	}
	
}

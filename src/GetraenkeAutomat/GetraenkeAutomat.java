package GetraenkeAutomat;

import java.util.Scanner;

public class GetraenkeAutomat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int selectedItem;
		float insertedMoney, returnedMoney;
		
		final float priceForWater = 1.50f;
		final float priceForCola = 2.00f;
		final float priceForCoffee = 2.50f;
		
		
		System.out.printf("Willkommen beim Getr\u00e4nkeautomaten!%n");
		
		System.out.printf("1: Wasser (%.2f €)%n", priceForWater);
		System.out.printf("2: Cola (%.2f €)%n", priceForCola);
		System.out.printf("3: Kaffee (%.2f €)%n", priceForCoffee);
		
		System.out.printf("Bitte wählen Sie Ihr Getr\u00e4nk! (1 - 3): ");
		selectedItem = scanner.nextInt();
		
		System.out.printf("%nBitte geben Sie den Betrag in Euro ein: ");
		insertedMoney = scanner.nextFloat();
		
		
		switch(selectedItem) {
		
			case 1:
				returnedMoney = insertedMoney - priceForWater;
				sb.append("Wasser");
				break;
				
			case 2:
				returnedMoney = insertedMoney - priceForCola;
				sb.append("Cola");
				break;
				
			case 3:
				returnedMoney = insertedMoney - priceForCoffee;
				sb.append("Kaffee");
				break;
			
			default:
				returnedMoney = 0;
				System.out.printf("Falsche Eingabe");
				System.exit(0);
			
		}
		
		
		
		sb.append("\nGezahlter Betrag: " + insertedMoney);
		if(sb.length() != 22) {
			sb.append("0");
		}
		sb.append("€");
		
		sb.append("\nWechselgeld: " + returnedMoney);
		if(sb.length() != 16) {
			sb.append("0");
		}
		sb.append(" €\n\n");
		
		
		sb.insert(0, "\nGetr\u00e4nk: ");
		
		if(returnedMoney >= 0) {
			
			System.out.printf(sb.toString());
			System.out.printf("Vielen Dank und guten Durst!");
			
		} else {
			
			System.out.printf("Zu wenig Geld!");
			
		}
		

	}

}

package FitnessStudioRechner;

import java.util.Scanner;

public class FitnessStudioRechner {

	public static void main(String[] args) {
		
		float sum;
		float userInputAsFloat;
		boolean saunaChecked, personalTrainingChecked;
		Scanner scanner = new Scanner(System.in);
		
		// types of membership
		final float basicMembershipPerMonth = 20;
		final float premiumMembershipPerMonth = 40;
		final float VIPMembershipPerMonth = 60;
		
		// types of additional services
		final float saunaPerMonth = 10;
		final float personalTraining = 30;
		
		// Get membership from user
		System.out.printf("Fitness-Studio-Rechner%n%n");
		
		System.out.printf("Preise der Mitgliedschaften pro Monat%n"
						+ "[1] Basic für 20 €%n"
						+ "[2] Premium für 40 €%n"
						+ "[3] VIP für 60 €%n%n");
		
		System.out.printf("Wählen Sie eine der Mitgliedschaften aus (1 - 3): ");
		userInputAsFloat = scanner.nextFloat();
		
		// Get additional services 
		System.out.printf("Zusatzleistungen%n%n");
		
		System.out.printf("Preise für Zusatzleistungen pro Monat%n"
						+ "Sauna +10 €%n"
						+ "Personal Training +30€%n%n");
		
		System.out.printf("Soll Sauna als Zusatzleistung gebucht werden (0 für ja / 1 für nein): ");
		
		
		System.out.printf("Soll Personal Training als Zusatzleistung gebucht werden (0 für ja / 1 für nein): ");

	}

}

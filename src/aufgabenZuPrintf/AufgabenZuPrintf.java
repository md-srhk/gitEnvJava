package aufgabenZuPrintf;

import java.util.Scanner;

public class AufgabenZuPrintf {

	public static void main(String[] args) {
		
		{
			System.out.printf("Aufgabe 1\n\n");
			
			int betragInt = 12;
			double betragDouble = 23.56789;
			String beispielString = "Hallo Welt!";
			
			System.out.printf("betragInt = %d\n", betragInt);
			System.out.printf("betragDouble = %f\n", betragDouble);
			System.out.printf("beispielString = %s\n", beispielString);
			
			System.out.printf("%n");
			
			System.out.printf("betragInt = %04d\n", betragInt);
			System.out.printf("betragDouble = %.2f\n", betragDouble);
			System.out.printf("beispielString = %S\n", beispielString);
			
			System.out.printf("%n");
			
			System.out.printf("betragInt = \t%04d\n", betragInt);
			System.out.printf("betragDouble = \t%.2f\n", betragDouble);
			System.out.printf("beispielString = \t%S\n", beispielString);
		}
		
		{
			System.out.printf("\nAufgabe 2\n\n");
			
			int menge = 2;
			double preis = 2.5;
			double ergebnis;
			
			System.out.printf("Preis: %.1f\n", preis);
			System.out.printf("Menge: %d\n", menge);
			
			System.out.printf("%n");
			
			ergebnis = menge * preis;
			
			System.out.println(
						"Menge: " + menge + ", " +
						"Preis: " + preis + ", " +
						"Endpreis: " + ergebnis
					);
			
			System.out.printf("%n");
			
			System.out.printf("Menge\t\t:%8d\n", menge);
			System.out.printf("Preis\t\t:%8.2f\n", preis);
			System.out.printf("Preis\t\t:%8.2f\n", ergebnis);
			
		}
		
		{
			System.out.printf("\nAufgabe 3\n\n");
			
			int artikel1Menge = 2;
			int artikel2Menge = 12;
			int artikel3Menge = 5;
			
			String artikel1Bezeichnung = "Schrauben";
			String artikel2Bezeichnung = "Nägel";
			String artikel3Bezeichnung = "Holzplatten";
			
			double artikel1Preis = 12.79;
			double artikel2Preis = 1.33;
			double artikel3Preis = 2.95;
			
			System.out.printf("%s\n" ,"*".repeat(36));
			System.out.printf("*\n");
			System.out.printf("* %-16s %03d %13.2f \n", artikel1Bezeichnung, artikel1Menge, artikel1Preis);
			System.out.printf("* %-16s %03d %13.2f \n", artikel2Bezeichnung, artikel2Menge, artikel2Preis);
			System.out.printf("* %-16s %03d %13.2f \n", artikel3Bezeichnung, artikel3Menge, artikel3Preis);
			System.out.printf("*\n");
			System.out.printf("%s\n" ,"*".repeat(36));
			
		}
		
		{
			// Was gibt der Code in der Console aus? (Aufgabe 5)
			
			/* a)
			 * 99
			 *   99
			 * 0099
			 * 99  
			 * 
			 * 36.548723
			 *   36.548723
			 * 0036.548723
			 * 36.54
			 *       36.54
			 */
			
			/* b)
			 * Ich liebe Döner.
			 * Ich könnte 1234 am Tag essen.
			 * Leider kostet er: 12.95
			 * 
			 * Ich liebe DÖNER.
			 * Ich könnte 001234 am Tag essen.
			 * Leider kostet er: 12.95 Euro.
			 * 
			 * Ich mag aber auch Pizza.
			 * Di ist mir aber zu teuer
			 * Die ist mir aber zu teuer.
			 */
			
			/* c)
			 * Preisliste Autohaus Müller
			 * * Audi 122 36980.9012
			 * * Audi 122 36980.9012
			 * * Audi 122 36980.90
			 * * Audi A8, 122 PS, 36980.90 Euro
			 * */
			
			/*
			 * d)
			 * * Preisliste Autohaus Maier *
			 * * Porsche Carrera    210 PS  41999,99 Euro
			 * * Mercedes SLK       280 PS  52900,00 Euro
			 * * VW Käfer            45 PS    926,80 Euro
			 */
			
			/*
			 * e)
			 * 3,654872E+01
			 * E
			 * 
			 */
			
			/*
			 * f)
			 * Das %f muss durch eine Fließkommazahl, also den Inhalt einer double oder float Variabele, ersetzt.
			 * Hier wird versucht den Inhalt einer Ganzzahl (Datentyp: int) zu ersetzen. Dies funktioniert nicht.
			 */
			
			/*
			 * g)
			 * Das \ ist " eine komische Ausgabe!
			 * */
			
		}
		

	}

}

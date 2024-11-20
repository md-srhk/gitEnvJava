package gitEnvJava;

import java.util.Scanner;

public class AufgabenIfElse {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 1 : Aufgabe 1");
		
		{
		    // Initialisierung der Variablen a und b
		    int a = 5, b = 6;

		    // Prüfung, ob a kleiner als b ist
		    if (a < b) {
		        // Wenn ja, wird a der Wert von b zugewiesen
		        a = b;
		    }

		    // Ausgabe des Wertes von a
		    System.out.print(a);
		    /*
		     * Erwartete Ausgabe:
		     * 6
		     */
		}

		System.out.println("\n\nAufgabe 1 : Aufgabe 2");

		{
		    // Initialisierung der Variablen a und b
		    int a = 5, b = 6;

		    // Überprüfung, ob a gleich b ist
		    if (a == b) {
		        // Wenn a gleich b ist, bleibt a unverändert
		        a = b;
		    } else {
		        // Ansonsten wird b der Wert von a zugewiesen
		        b = a;
		    }

		    // Ausgabe der Werte von a und b
		    System.out.print(a);
		    System.out.print(b);
		    /*
		     * Erwartete Ausgabe:
		     * 55
		     */
		}

		System.out.println("\n\nAufgabe 1 : Aufgabe 3");

		{
		    // Initialisierung der Variablen a, b und c
		    int a = 5, b = 6, c = 7;

		    // Prüfung, ob a kleiner als b ist
		    if (a < b) {
		        // Wenn ja, wird weiter geprüft, ob b kleiner als c ist
		        if (b < c) {
		            // Wenn beide Bedingungen erfüllt sind, wird a der Wert von c
		            a = c;
		        }
		    }

		    // Ausgabe der Werte von a, b und c
		    System.out.print(a);
		    System.out.print(b);
		    System.out.print(c);
		    /*
		     * Erwartete Ausgabe:
		     * 767
		     */
		}

		System.out.println("\n\nAufgabe 1 : Aufgabe 4");

		{
		    // Initialisierung der Variablen a, b und c
		    int a = 5, b = 6, c = 7;

		    // Überprüfung, ob a größer als b ist
		    if (a > b) {
		        // Wenn a größer als b ist, wird a der Wert von b
		        a = b;
		    } else {
		        // Wenn a nicht größer als b ist, wird geprüft, ob a kleiner als c ist
		        if (a < c) {
		            // Wenn a kleiner als c ist, wird a der Wert von c
		            a = c;
		        }
		    }

		    // Ausgabe der Werte von a, b und c
		    System.out.print(a);
		    System.out.print(b);
		    System.out.print(c);
		    /*
		     * Erwartete Ausgabe:
		     * 767
		     */
		}

		
		{
		    // Test 1: Initialisierung und Überprüfung, ob der Wert von intValue gleich 12 ist
		    System.out.println("\n\nAufgabe 2: Test 1 mit intValue=12");
		    {
		        int intValue; // Deklaration der Variablen intValue
		        intValue = 12; // Zuweisung des Wertes 12

		        // Überprüfung, ob intValue gleich 12 ist
		        if (intValue == 12) {
		            // Wenn ja, Ausgabe des entsprechenden Textes
		            System.out.println("Der Wert ist 12");
		        }
		    }

		    // Test 2: Überprüfung, ob intValue gleich 12 ist oder nicht
		    System.out.println("\n\nAufgabe 2: Test 2 mit intValue=13");
		    {
		        int intValue; // Deklaration der Variablen intValue
		        intValue = 13; // Zuweisung des Wertes 13

		        // Überprüfung, ob intValue gleich 12 ist
		        if (intValue == 12) {
		            // Wenn ja, Ausgabe des entsprechenden Textes
		            System.out.println("Der Wert ist 12");
		        } else {
		            // Wenn nein, Ausgabe eines anderen Textes
		            System.out.println("Der Wert ist nicht 12");
		        }
		    }

		    // Test 3: Überprüfung mehrerer Bedingungen für intValue
		    System.out.println("\n\nAufgabe 2: Test 3 mit intValue=11");
		    {
		        int intValue; // Deklaration der Variablen intValue
		        intValue = 11; // Zuweisung des Wertes 11

		        // Überprüfung, ob intValue gleich 12 ist
		        if (intValue == 12) {
		            System.out.println("Der Wert ist 12");
		        }

		        // Überprüfung, ob intValue größer als 10 ist
		        if (intValue > 10) {
		            System.out.println("Der Wert ist groesser als 10");
		        } else {
		            // Wenn keine der Bedingungen zutrifft
		            System.out.println("Der Wert ist nicht 12");
		        }
		    }

		    // Test 4: Mehrere Bedingungen, einschließlich zusätzlicher Überprüfungen
		    System.out.println("\n\nAufgabe 2: Test 4 mit intValue=13");
		    {
		        int intValue; // Deklaration der Variablen intValue
		        intValue = 13; // Zuweisung des Wertes 13

		        // Überprüfung, ob intValue gleich 12 ist
		        if (intValue == 12) {
		            System.out.println("Der Wert ist 12");
		        }

		        // Überprüfung, ob intValue größer als 10 ist
		        if (intValue > 10) {
		            System.out.println("Der Wert ist groesser als 10");
		        }

		        // Überprüfung, ob intValue größer oder gleich 12 ist
		        if (intValue >= 12) {
		            System.out.println("Der Wert ist groesser als 10");
		        } else {
		            // Wenn keine der Bedingungen zutrifft
		            System.out.println("Der Wert ist nicht 12");
		        }
		    }
		}

		
		
		{	
			System.out.println("\n\nAufgabe 3: Test 1 mit doubleValue=6.67");
			{
				double doubleValue;
				doubleValue = 6.67;
				
				if(doubleValue == 0) {
					
					System.out.println("Der Wert ist 0.");
					
				} else if(doubleValue == 5.5) {
					
					System.out.println("Der Wert ist 5,5.");
					
				} else {
					
					System.out.println("Der Wert ist nicht 0 und nicht 5,5.");
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 3: Test 2 mit doubleValue=5.5");
			{
				double doubleValue;
				doubleValue = 5.5;
				
				if(doubleValue == 0) {
					
					System.out.println("Der Wert ist 0.");
					
				} else if(doubleValue == 5.5) {
					
					System.out.println("Der Wert ist 5,5.");
					
				} else {
					
					System.out.println("Der Wert ist nicht 0 und nicht 5,5.");
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 3: Test 2 mit doubleValue=0");
			{
				double doubleValue;
				doubleValue = 0;
				
				if(doubleValue == 0) {
					
					System.out.println("Der Wert ist 0.");
					
				} else if(doubleValue == 5.5) {
					
					System.out.println("Der Wert ist 5,5.");
					
				} else {
					
					System.out.println("Der Wert ist nicht 0 und nicht 5,5.");
					
				}
				
			}
			
		}
		
		{
			System.out.println("\n\nAufgabe 4: Test 1 mit intValue=5 und intValue2=10");
			{
				int intValue1 = 5;
				int intValue2 = 10;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
			}

			System.out.println("\n\nAufgabe 4: Test 2 mit intValue=1 und intValue2=10");
			{
				int intValue1 = 1;
				int intValue2 = 10;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 4: Test 3 mit intValue=5 und intValue2=10");
			{
				int intValue1 = 5;
				int intValue2 = 10;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
				if(intValue1 == 5 || intValue2 == 10) {
					
					System.out.println("Der Wert von intValue1 ist 5 oder/und der Wert von intValue2 ist 10");
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 4: Test 4 mit intValue=7 und intValue2=10");
			{
				int intValue1 = 7;
				int intValue2 = 10;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
				if(intValue1 == 5 || intValue2 == 10) {
					
					System.out.println("Der Wert von intValue1 ist 5 oder/und der Wert von intValue2 ist 10");
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 4: Test 5 mit intValue=7 und intValue2=10");
			{
				int intValue1 = 7;
				int intValue2 = 10;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
				if(intValue1 == 5 || intValue2 == 10) {
					
					System.out.println("Der Wert von intValue1 ist 5 oder/und der Wert von intValue2 ist 10");
					
				}
				
				if(!(intValue1 == 5 && intValue2 == 10)) {
					
					System.out.println("Der Wert von intValue1 ist nicht 5 und der Wert von intValue2 ist nicht 10.");
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 4: Test 5 mit intValue=7 und intValue2=7");
			{
				int intValue1 = 7;
				int intValue2 = 7;
				
				if(intValue1 == 5) {
					
					if(intValue2 == 10) {
						
						System.out.println("Der Wert von intValue1 ist 5 und der Wert von intValue2 ist 10.");
						
					}
					
				}
				
				if(intValue1 == 5 || intValue2 == 10) {
					
					System.out.println("Der Wert von intValue1 ist 5 oder/und der Wert von intValue2 ist 10");
					
				}
				
				if(!(intValue1 == 5 && intValue2 == 10)) {
					
					System.out.println("Der Wert von intValue1 ist nicht 5 und der Wert von intValue2 ist nicht 10.");
					
				}
				
			}
			
		}
		
		{
			
			System.out.println("\n\nAufgabe 5\n");
			
			{
				
				Scanner scanner = new Scanner(System.in);
				int intValue;
				String stringValue;
				
				System.out.print("Gebe eine Ganzzahl ein: ");
				intValue = scanner.nextInt();
				
				System.out.print("Gebe eine Zeichenkette ein ");
				stringValue = scanner.next();
				
				if(intValue == 10) {
					
					System.out.println("Es ist eine 10!");
					
				}
				
				if(stringValue.equals("Hallo")) {
					
					System.out.println("Es ist eine Hallo");
					
				}
			}
			
			System.out.println("\n\nAufgabe 5 : Erweiterung 1");
			
			{
				
				Scanner scanner = new Scanner(System.in);
				int intValue;
				String stringValue;
				
				System.out.print("Gebe eine Ganzzahl ein: ");
				intValue = scanner.nextInt();
				
				System.out.print("Gebe eine Zeichenkette ein: ");
				stringValue = scanner.next();
				
				if(intValue == 10) {
					
					System.out.println("Es ist eine 10!");
					
				} else {
					
					System.out.println("Es ist keine 10!");
					
				}
				
				if(stringValue.equals("Hallo")) {
					
					System.out.println("Es ist eine Hallo");
					
				}
			}
			
			System.out.println("\n\nAufgabe 5 : Erweiterung 2");
			
			{
				
				Scanner scanner = new Scanner(System.in);
				int intValue;
				String stringValue;
				
				System.out.print("Gebe eine Ganzzahl ein: ");
				intValue = scanner.nextInt();
				
				System.out.print("Gebe eine Zeichenkette ein: ");
				stringValue = scanner.next();
				
				if(intValue == 10) {
					
					System.out.println("Es ist eine 10!");
					
				} else {
					
					System.out.println("Es ist keine 10!");
					
				}
				
				if(stringValue.equals("Hallo")) {
					
					System.out.println("Es ist eine Hallo");
					
				} else {
					
					System.out.println("Es ist nicht Hallo");
					
				}
			}
			
			System.out.println("\n\nAufgabe 5 : Erweiterung 3");
			
			{
				
				Scanner scanner = new Scanner(System.in);
				int intValue;
				String stringValue;
				
				System.out.print("Gebe eine Ganzzahl ein: ");
				intValue = scanner.nextInt();
				
				System.out.print("Gebe eine Zeichenkette ein: ");
				stringValue = scanner.next();
				
				if(intValue == 10) {
					
					System.out.println("Es ist eine 10!");
					
				} else {
					
					System.out.println("Es ist keine 10!");
					
				}
				
				if(stringValue.equals("Hallo")) {
					
					System.out.println("Es ist eine Hallo");
					
				} else {
					
					System.out.println("Es ist nicht Hallo");
					
				}
				
				if(stringValue == "Hallo") {
					
					if(intValue == 10) {
						
						System.out.println("Super");
						
					}
					
				}
				
			}
			
			System.out.println("\n\nAufgabe 5 : Erweiterung 4");
			
			{
				
				Scanner scanner = new Scanner(System.in);
				int intValue;
				String stringValue;
				double doubleValue;
				
				System.out.print("Gebe eine Ganzzahl ein: ");
				intValue = scanner.nextInt();
				
				System.out.print("Gebe eine Zeichenkette ein: ");
				stringValue = scanner.next();
				
				System.out.print("Gebe eine Fließkommazahl ein: ");
				doubleValue = scanner.nextDouble();
				
				if(intValue == 10) {
					
					System.out.println("Es ist eine 10!");
					
				} else {
					
					System.out.println("Es ist keine 10!");
					
				}
				
				if(stringValue.equals("Hallo")) {
					
					System.out.println("Es ist eine Hallo");
					
				} else {
					
					System.out.println("Es ist nicht Hallo");
					
				}
				
				if(stringValue == "Hallo") {
					
					if(intValue == 10) {
						
						System.out.println("Super");
						
					}
					
				}
				
				if(doubleValue == 2.5 || doubleValue == 5.5) {
					
					System.out.println("Treffer");
				}
				
			}
			
			
			
		}
		
	}

}

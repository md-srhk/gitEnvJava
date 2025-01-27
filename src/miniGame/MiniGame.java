package miniGame;

import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;

public class MiniGame {

    public static void main(String[] args) {
        
        // Initialize scanner for user input and random generator
        Scanner scanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        // Create a word for possible use in the word game mode
        StringBuilder originalWord = new StringBuilder("passionsfrucht");
        StringBuilder word = new StringBuilder("passionsfrucht");
       
        String name;
        
        int attempts = 5; // Number of attempts
        String playersAnswer; //  Player's answer due to question if he wants to continue the game
        
        // Mix the characters of a word
        StringBuilder mixedWord = new StringBuilder("");
        
        for(int x = 0; x < 8; x++) {
        	
        	if( x > 1) {
        		
        		word = mixedWord;
            	mixedWord = new StringBuilder("");
            	
        	}
        	
        	for(int i = word.length() - 1; i >= 0; i--) {
            	
            	if(randomGen.nextBoolean()) {
            		
            		mixedWord.append(word.charAt(i));
            		word.deleteCharAt(i);
            		
            	} else {
            		
            		mixedWord.insert(0, word.charAt(i));
            		word.deleteCharAt(i);
            		
            	}

            }
        	
        }
        
        
        
        // Game loop control variables
        boolean playerWantsToPlay = true;
        int gamemode = 0;
        
        // Welcome message and get player's name
        System.out.printf("Hallo Spieler. Willkommen zum Mini-Game.%n");
        System.out.printf("Wie lautet dein Name: ");
        name = scanner.nextLine();
        
        while (playerWantsToPlay) {
            
            gamemode = 0;
            
            // Prompt user to select a game mode
            while (gamemode < 1 || gamemode > 2) {
            	
                System.out.printf(""
                        + "%nWelche Kategorie möchtest Du spielen. Gebe eine Zahl für den Spielmodus ein.%n"
                        + "[1] Zahlen%n"
                        + "[2] Wort%n%n"
                        + "%n"
                        + "Gebe eine Zahl für den Spielmodus ein: ");
                
                gamemode = scanner.nextInt();
                
            }
                
            
            switch (gamemode) {
            
 
            
                case 1:
                    
                    // Number guessing game mode
                    int enteredNumber = 0;
                    int wantedNumber = randomGen.nextInt(1, 100); // Random target number
                    
                    attempts = 5; // Reset number of attempts
                    
                    while (attempts > 0) {
                        
                        System.out.printf("%nAnzahl der verbleibenden Versuche %d%n", attempts);
                        System.out.printf("Gebe eine Nummer ein: ");
                        
                        enteredNumber = scanner.nextInt();
                        
                        if (enteredNumber < wantedNumber) {
                        	
                            // Inform user the guess is too low
                            System.out.printf("Die Zahl ist zu klein.%n%n");
                            attempts--;
                            
                        } else if (enteredNumber > wantedNumber) {
                        	
                            // Inform user the guess is too high
                            System.out.printf("Die Zahl ist zu hoch.%n%n");
                            attempts--;
                            
                        } else {
                        	
                            // User guessed correctly
                            System.out.printf("Das ist die Zahl!%n%n");
                            break;
                            
                        }
                        
                        if (attempts < 1) {
                        	
                            // Out of attempts
                            System.out.printf("Du hast deine Versuche verbraucht!%n%n");
                            
                        }
                    }
                    
                    break;
                    
                case 2:
                	
                	// Word guessing game mode
                	StringBuilder enteredWord = new StringBuilder();
                	
                	attempts = 5; // Reset number of attempts
                	
                    System.out.printf("Ratte das Word%n");
                    System.out.printf("Die gemischte Version des Wortes: %S", mixedWord);
                    
                    
                    
                    enteredWord = new StringBuilder(scanner.nextLine().toLowerCase());
                    
                    while(attempts > 0) {
                    	
                    	System.out.printf("%nAnzahl der verbleibenden Versuche %d%n", attempts);
                        System.out.printf("Versuche das Wort zu erraten: ");
                        
                        enteredWord = new StringBuilder(scanner.nextLine().toLowerCase());
                        
                        // Checks if the words are the same
                        if(enteredWord.equals(originalWord)) {
                        	
                        	System.out.printf("Das ist das Wort!%n%n");
                            break;
                            
                        } else {
                        	
                        	System.out.printf("Das ist nicht das Wort!%n");
                        	attempts--;
                        }
                        
                        if (attempts < 1) {
                        	
                            // Out of attempts
                            System.out.printf("Du hast deine Versuche verbraucht!%n%n");
                            
                        }
                    }
                    
                    break;
            }
            
            
            playersAnswer = ""; // Reset the variable playersAnswer
            
            while(playersAnswer.equals("")) {
            	
            	System.out.printf("Soll weitergespielt werden (ja/nein): %n");
            	playersAnswer = scanner.nextLine().toLowerCase();
            	
            	switch(playersAnswer) {
            	case "nein":
            		playerWantsToPlay = false;
            		break;
            	case "ja":
            		break;
            	default:
            		playersAnswer = "";
            	}
            	
            }
        }
    }
}

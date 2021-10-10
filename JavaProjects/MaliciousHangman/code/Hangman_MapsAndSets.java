/* Ryan Young 5/21/2021 */
package project4;

import java.io.*;
import java.util.*;

public class Hangman_MapsAndSets {
	/**Second draft of the (partially) Malicious Hangman implementation.
	 * 
	 * DATA STORAGE:
	 * In this implementation, we never store the whole dictionary in a data structure.
	 * We first ask the user to choose a word length, and then read only words
	 * of that length from the dictionary into a HashSet (validWords), which will be
	 * modified as the game progresses.
	 * */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many letters?");
		int wordLength = keyboard.nextInt();
		System.out.println(wordLength);
		
		HashSet<String> validWords = wordsOfLength(wordLength);
		
//		System.out.println("There are " + validWords.size() + " words to choose from.");
		
		keyboard = new Scanner(System.in);
		System.out.println("How many guesses do you get?");
		int remainingGuesses = keyboard.nextInt();
		char[] chosenWord = null;
		boolean gameWon = false;
		
		ArrayList<Character> guesses = new ArrayList<>();
		ArrayList<Character> answer = new ArrayList<>();
		
		
		/** GAME STARTS*/
		while (!gameWon && remainingGuesses > 0) {
			// PRINT HEADER
			if (chosenWord == null)
				for (int i = 0; i < wordLength; i++)
					System.out.print("_ ");
			else {
				for (int i = 0; i < answer.size(); i++) {
					if (answer.get(i) == null)
						System.out.print("_ ");
					else
						System.out.print(answer.get(i) + " ");
				}
			}
			System.out.println("\nGuesses remaining: " +  remainingGuesses);

			// TAKE INPUT
			System.out.print("\nTake your guess:");
			String input = keyboard.next();
			Character character = input.charAt(0);
			
			// PROCESS GUESS
			if (!guesses.contains(character)) {

				guesses.add(character);
				remainingGuesses--;

				// If we haven't chosen a word yet:
				if (chosenWord == null) {

					HashSet<String> matches = new HashSet<>();
					HashSet<String> antiMatches = new HashSet<>();
					
					for (String s : validWords) {
						if (s.contains(character.toString()))
							matches.add(s);
						else
							antiMatches.add(s);
					}
					
//					System.out.println("Matches: " + matches.size() + " words.");
//					System.out.println("Antimatches: " + antiMatches.size() + " words.");
					
					if (antiMatches.size() == 0) {
						// We can now choose a word!
						int randomIndex = (int)(Math.random() * matches.size()-1);
						int currIndex = 0;
						Iterator<String> iter = matches.iterator();
						while (iter.hasNext()) {
							String word = iter.next();
							if (currIndex == randomIndex)
								chosenWord = word.toCharArray();
							currIndex++;
						}
						// Fill the answer array with null values except for the one correct guess
						for (char c : chosenWord) {
							if (c == character)
								answer.add(character);
							else
								answer.add(null);
						}
						System.out.println("Correct!");
						System.out.println("Let me tell you a very important secret. The word I've chosen is " + String.valueOf(chosenWord));
					} else {
						validWords = antiMatches;
						System.out.println("Sorry, your guess is incorrect.");
					}

				// If a word has been chosen
				} else {
					boolean correct = false;
					for (int i = 0; i < chosenWord.length; i++) {
						if (chosenWord[i] == character) {
							correct = true;
							answer.set(i, character);
						}
					}
					if (!correct)
						System.out.println("Sorry, your guess is incorrect.");
					else {
						System.out.println("Correct!");
						int countNulls = 0;
						for (int i = 0; i < answer.size(); i++)
							if (answer.get(i) == null)
								countNulls++;
						if (countNulls == 0)
							gameWon = true;
						
					}
				}
			} else
				System.out.println("You already guessed " + character + ". Guess again!");
			
		}
		if (gameWon) {
			System.out.print("CONGRATS! YOU WON! Your answer: ");
			for (Character c : answer)
				System.out.print(c);
			for (int i = 0; i < wordLength - answer.size(); i++) {
				System.out.print("_ ");
			}
			System.out.println();
		} else {
			System.out.println("You lost.");
			System.out.println("The correct word was " + String.valueOf(chosenWord) + ".");
		}

	}
	
	public static HashSet<String> wordsOfLength(int wordLength) {
		// Place all words of given length into a hashset
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(new FileInputStream("Dictionary.txt"));
		} catch (FileNotFoundException e) {
		}

		HashSet<String> words = new HashSet<String>();

		while (fileReader.hasNextLine()) {
			String word = fileReader.nextLine().toLowerCase().trim();
			if (word.length() == wordLength)
				words.add(word);
		}

		return words;
	}
	
}

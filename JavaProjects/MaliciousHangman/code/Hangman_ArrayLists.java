/* Ryan Young 5/21/2021 */
package project4;
import java.io.*;
import java.util.*;

public class Hangman_ArrayLists {
	/**First draft of the (partially) Malicious Hangman implementation.
	 * 
	 * DATA STORAGE:
	 * The dictionary is read into an ArrayList of ArrayLists, where each
	 * element is a list of words whose character count is one more than the
	 * index. So index 5 contains a list of all 6 letter words, for example.
	 * When the user provides the length, we can, in constant time, retrieve
	 * all possible words.*/

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groups = wordsGroupedByLength();
		
		Scanner keyboard = new Scanner(System.in);
		int wordLength = Integer.MAX_VALUE;
		while (wordLength > groups.size()) {
			System.out.print("How many letters?");
			wordLength = keyboard.nextInt();
			System.out.println(wordLength);
		}
		ArrayList<String> validWords = groups.get(wordLength-1); 
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
					ArrayList<String> matches = new ArrayList<>();
					ArrayList<String> antiMatches = new ArrayList<>();
					
					for (String s : validWords) {
						if (s.contains(character.toString()))
							matches.add(s);
						else
							antiMatches.add(s);
					}
					
					System.out.println("Matches: " + matches.size() + " words.");
					System.out.println("Antimatches: " + antiMatches.size() + " words.");
					
					if (antiMatches.size() == 0) {
						int index = (int)(Math.random() * matches.size()-1);
						chosenWord = matches.get(index).toCharArray();
						System.out.println("Correct!");
						// Fill the answer array with null values except for the one correct guess
						for (char c : chosenWord) {
							if (c == character)
								answer.add(character);
							else
								answer.add(null);
						}
						System.out.println("The word I've chosen is " + String.valueOf(chosenWord));
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
			System.out.print("CONGRATS! YOU WON! Your answer:  ");
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
	
	public static ArrayList<ArrayList<String>> wordsGroupedByLength() {
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(new FileInputStream("Dictionary.txt"));
		} catch (FileNotFoundException e) {
		}
		ArrayList<ArrayList<String>> groups = new ArrayList<>();
		while (fileReader.hasNextLine()) {
			String word = fileReader.nextLine().toLowerCase().trim();
			if (word.length() > groups.size()) {
				while (word.length() > groups.size())
					groups.add(new ArrayList<>());
			}
			groups.get(word.length()-1).add(word);
		}
		
		for (ArrayList<String> arr : groups) {
			Collections.sort(arr);
		}
		return groups;
	}
	
}

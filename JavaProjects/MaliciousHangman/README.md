### This is technically **Partially Malicious Hangman**, not **Fully Malicious Hangman**.

In Partially Malicious Hangman, when you start guessing, the computer will look through the english dictionary and remove all words containing the letter you guessed, and then tell you that your guess was incorrect. It will continue this until every possible word to choose from contains the letter you guessed, and it will pick one at random. Then, it will continue the game as normal.

If you have enough guesses, you can easily beat Partially Malicious Hangman by simply guessing all of the vowels first, eliminating most possible words.

Fully Malicious Hangman will always choose the action that leaves the largest number of words to choose from on your next guess. This allows it to cheat for much longer. 

package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		// Create a scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);

		// Create a Random object to generate a random number
		Random random = new Random();

		// Generate a random number between 1 and 100
		int randomNumber = random.nextInt(100) + 1;
		// To store the user's guess
		int userGuess = 0;
		// To count the number of attempts
		int attempts = 0;

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

		// Loop until the user guesses the correct number
		while (userGuess != randomNumber) {
			System.out.print("Enter your guess: ");
			userGuess = scanner.nextInt();
			attempts++; // Increment the attempt count

			// Check if the guess is too high, too low, or correct
			if (userGuess > randomNumber) {
				System.out.println("Your guess is too high.");
			} else if (userGuess < randomNumber) {
				System.out.println("Your guess is too low.");
			} else {
				System.out.println("Congratulations! You guessed the number.");
				System.out.println("It took you " + attempts + " attempts to guess the correct number.");
			}
		}

		scanner.close();
	}
}

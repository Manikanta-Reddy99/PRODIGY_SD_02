# PRODIGY_SD_02
#  Project Description:
The Guessing Game is a simple interactive game where the user tries to guess a randomly generated number within a certain range. The computer provides feedback to help the player by indicating whether the guess is too high, too low, or correct. The game continues until the player successfully guesses the correct number. The objective is to guess the correct number in the fewest possible attempts. The project involves basic programming concepts such as loops, conditionals, input handling, and random number generation.

# Features:
# Random Number Generation:

The program generates a random number within a predefined range (e.g., 1 to 100) that the user needs to guess.
User Input:

Players input their guesses through the console.
# Feedback System:

The program gives immediate feedback on each guess:

"Too High" if the guess is greater than the target number.

"Too Low" if the guess is smaller than the target number.

"Correct!" if the guess matches the target number.
# Guess Counter:

The game keeps track of the number of guesses a player makes before guessing correctly.
# Option to Play Again:

After the player guesses the correct number, they are given the option to play again or exit the game.
# technologies and concepts:

### **1. Core Java**
   - **Programming Language:** The entire project is written in Java, which provides robust libraries and a platform for building a wide range of applications.

### **2. Java Standard Library**
   - **`java.util.Random`:** 
     - Used to generate random numbers for the player to guess. This library is part of the Java standard package for utilities.
   - **`java.util.Scanner`:**
     - Used to handle user input from the console, making it possible for the player to enter guesses interactively.

### **3. Object-Oriented Programming (OOP) Concepts**
   - **Classes and Objects:** The code structure revolves around a main class (`GuessingGame`), which encapsulates the logic and execution of the game.
   - **Encapsulation:** All game logic is contained within a single class, managing input, output, and logic in a modular way.

### **4. Control Structures**
   - **Loops (`while`):** Used to repeatedly ask the user for a guess until they either win or run out of attempts.
   - **Conditionals (`if-else`):** Used for decision-making, such as determining whether the guess is too high, too low, or correct, and handling invalid input.


### **5. Console-Based User Interface**
   - The game is designed to be played via the command line or terminal, with all interaction happening through text inputs and outputs.


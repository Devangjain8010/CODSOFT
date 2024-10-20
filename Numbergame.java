import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 5; // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("\nA new number has been generated! Try to guess it between 1 and 100.");
            System.out.println("You have " + attempts + " attempts.");

            // Loop for guessing attempts
            while (attempts > 0 && !guessedCorrectly) {
                System.out.print("\nEnter your guess: ");
                int userGuess = scanner.nextInt();
                attempts--;

                // Check if the guess is correct, too high, or too low
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += 10; // Add points to score for a correct guess
                    guessedCorrectly = true;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                if (!guessedCorrectly) {
                    System.out.println("Attempts left: " + attempts);
                }
            }

            // If all attempts are used
            if (!guessedCorrectly) {
                System.out.println("\nSorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }

            // Display current score
            System.out.println("Your current score is: " + score);

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String userResponse = scanner.next().toLowerCase();
            playAgain = userResponse.equals("yes");
        }

        System.out.println("\nThank you for playing! Your final score is: " + score);
        scanner.close();
    }
}

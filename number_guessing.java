import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=== Welcome to the Number Guessing Game! ===");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI've picked a number between 1 and 100. Try to guess it!");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter a number: ");
                    scanner.next(); // clear invalid input
                }
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // consume newline
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye.");
            }
        }

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;

        while (true) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have 6 attempts to guess it.");

            while (attempts < 6) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed it!");
                    totalScore += 7 - attempts;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == 6) {
                System.out.println("Sorry, you didn't guess it. The number was " + secretNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Your final score is " + totalScore);
    }
}
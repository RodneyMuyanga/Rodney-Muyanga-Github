import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    private static int rnd_number;

    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    public static void makeAGuess() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object.

        // Read user input as a string
        String input = scanner.nextLine();

        // Check if the input is numeric
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            
            // Compare the user's guess with the random number
            if (number == rnd_number) {
            System.out.println("Congratulations! You guessed it right.");
            } else if (number < rnd_number) {
            System.out.println("Try again. Your guess is too low.");
                makeAGuess(); // Call this method recursively for another guess
            } else {
            System.out.println("Try again. Your guess is too high.");
                makeAGuess(); // Call this method recursively for another guess
            }
            } else {
            System.out.println("You did not enter a valid number. Please try again.");
                makeAGuess(); // Call this method recursively for another guess
        }
        scanner.close(); // ikke nødvendigt. 
    }
}

import java.util.Scanner;

public class SecretNumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 26;   // keep a secret number between 20 and 30
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 20 and 30:");

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess != secretNumber) {
                System.out.println("Wrong! Try again:");
            }

        } while (guess != secretNumber);

        System.out.println("Correct! You guessed the secret number.");
        System.out.println("Total attempts: " + attempts);
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    private int secretNumber = (int) Math.round(Math.random() * 500);
    private int guesses = 0;
    private int guess;
    private static final Scanner s = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        boolean guessed = false;
        while (!guessed) {

            System.out.println("Input Guess: ");
            guess = s.nextInt();
            guesses++;
            if (guess == secretNumber) {
                System.out.println("Correct! You guessed in " + guesses + " guess(es)");
                guessed = true;
            } else if (guess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
        }
    }
}


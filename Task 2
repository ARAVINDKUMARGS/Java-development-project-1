import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100) + 1, guess, tries = 0;

        System.out.println("Guess the number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
        } while (guess != number);

        System.out.println("Correct! You took " + tries + " attempts.");
    }
}

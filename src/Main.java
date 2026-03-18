import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        boolean playAgain = true;
        do {

        int secretNum = random.nextInt(100) + 1;
        int attempt = 0;
        int guess = 0;

        System.out.println("Guess a number from 1-100");

            while (guess != secretNum && attempt <= 7) {

                System.out.print("Enter a number: ");
                guess = scanner.nextInt();
                attempt++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Pick a number between 1-100");
                }

                else if (guess < secretNum) {
                    System.out.println("Too low, guess higher");
                }

                else if (guess > secretNum) {
                    System.out.println("Too high, guess lower");
                }

                else {
                    System.out.println("Good job! You guessed the number!");
                }
            }

            if (guess != secretNum) {
                System.out.println("Try again later, too many attempts.");
            }

            System.out.print("Would you like to continue playing (y/n): ");
            String answer = scanner.next();
            answer = answer.toLowerCase();
            playAgain = answer.equals("y");

        } while (playAgain);


        System.out.print("Thank you for playing!");
        scanner.close();
    }
}

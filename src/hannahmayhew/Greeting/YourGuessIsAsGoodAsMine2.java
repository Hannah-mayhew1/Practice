package hannahmayhew.Greeting;

import java.util.Random;
import java.util.Scanner;

public class YourGuessIsAsGoodAsMine2 {
    public static void main(String[] args) {
        System.out.println("Please think of a number in your head and type 'done' when finished.");

        Scanner done = new Scanner(System.in);
        String finished = done.next();

        boolean win = false;

        if (finished.equals("done")) {
                int max = 100;
                int guess = max / 2;
                int min = 0;
                int noOfGuesses = 0;
                System.out.println("Is your number equal to, higher or lower than " + guess + "?");

            while (!win) {

                Scanner userInput = new Scanner(System.in);
                String answer = userInput.next();


                if (answer.equals("higher")) {
                    min = guess;
                    guess = min + (max - min) / 2;
                    System.out.println("Is your number equal to, higher or lower than " + guess + "?");
                    noOfGuesses++;
                }

                else if (answer.equals("lower")) {
                    max = guess;
                    guess = min + (max - min) / 2;
                    System.out.println("Is your number equal to, higher or lower than " + guess + "?");
                    noOfGuesses++;
                }

                else if (answer.equals("equal")) {
                    noOfGuesses++;
                    win = true;
                    System.out.println("Woohoo! I guessed your number in " + noOfGuesses + " guesses!");
                }

            }


        }
    }
}

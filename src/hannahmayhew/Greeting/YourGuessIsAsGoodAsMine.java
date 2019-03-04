package hannahmayhew.Greeting;

import java.util.Random;
import java.util.Scanner;

public class YourGuessIsAsGoodAsMine {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("I'm thinking of a number between 1 and 100. What is my number?");


        boolean win = false;


        while (!win) {
            Scanner userInput = new Scanner(System.in);
            int input = userInput.nextInt();

            if (input == randomNumber) {
                win = true;
            }
            else if (input < randomNumber) {
                System.out.println("Your number is too small, try again!");
            }
            else if (input > randomNumber) {
                System.out.println("Your number is too big, try again!");
            }
        }

        System.out.println("That is correct! My number is " + randomNumber + "!");

    }
}

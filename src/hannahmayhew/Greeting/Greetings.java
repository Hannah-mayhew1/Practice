package hannahmayhew.Greeting;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        System.out.println("Hello! Please tell me your name:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("Alice") || input.equals("Bob")) {
            System.out.println("Hello " + input + ", it's nice to see you again!");
        } else {
            System.out.println("Looks like we haven't met before!");
        }
    }
}

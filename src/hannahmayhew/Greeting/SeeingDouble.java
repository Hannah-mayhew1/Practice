package hannahmayhew.Greeting;

import java.util.Scanner;

public class SeeingDouble {
    public static void main(String[] args) {

        String input, reverse = "";

        System.out.println("Please enter a word or a sentence to check if it is a palindrome:");

        Scanner scanner = new Scanner(System.in);
        input = scanner.next();

        for (int i = input.length() - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);// reverses the string using backward loop

        if (input.equals(reverse))
            System.out.println("This is a palindrome.");
        else
            System.out.println("This is not a palindrome.");
    }
}

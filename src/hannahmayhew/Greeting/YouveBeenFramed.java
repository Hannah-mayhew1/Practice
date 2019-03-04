package hannahmayhew.Greeting;

import java.util.Scanner;


// need to determine max length of string

public class YouveBeenFramed {
    public static void main(String[] args) {

        System.out.println("Please enter a list of words or a sentence:");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        String[] splitString = input.split("\\s+");

        int maxLength = 0;

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].length() >= maxLength) {
                maxLength = splitString[i].length();
            }
        } // This loop determines the maximum length of the longest word

        StringBuilder buildString = new StringBuilder();

        for (int index = 0; index < maxLength + 4; index++) {

            buildString.append("-");
        }
        System.out.println(buildString);

        for (int index = 0; index < splitString.length; index++) {
            System.out.println("| " + splitString[index] + width(maxLength - splitString[index].length()) + " |");
        }

        for (int index = 0; index < maxLength + 4; index++) {
            System.out.print("-");
        }
    }

    private static String width(int maxLength) {

        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            spaces.append(" ");
        }
        return spaces.toString();

    }
}

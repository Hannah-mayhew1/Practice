package hannahmayhew.Greeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RightBackAtYou {
    public static void main(String[] args) {

        List<Integer> numbers = printNumbers();
        for (int i = numbers.size()-1; i >= 0; i--)
            System.out.println(numbers.get(i));
        //to print in order = System.out.println(numbers) without for loop
    }

    private static List<Integer> printNumbers() {
        System.out.print("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        while (scanner.hasNextInt()) {
            System.out.println("Enter a number or 'finished':");
            numbers.add(scanner.nextInt());
        }

        return numbers;
    }
}

package hannahmayhew.Greeting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {
        System.out.println("Please insert a number:");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            if (input > 0) {

                int total = 0;
                for (int i = 0; i <= input; i++) {
                    if (i % 3 == 0 || i % 5 == 0) {
                        total = total + i;
                    }
                }
                    System.out.println("The sum of the values from 1 to " + input + ", that are divisible by 3 and 5, are " + total);
            }
            else {
                System.out.println("Invalid input. Please insert a positive integer");
            }
        }
        else {
            System.out.println("Invalid input. Please insert a positive integer");
        }
    }
}

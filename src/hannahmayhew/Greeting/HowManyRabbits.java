package hannahmayhew.Greeting;

import java.util.Scanner;

public class HowManyRabbits {

    public static void main(String[] args) {

        int t1 = 0, t2 = 1;
        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; ++i) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

package hannahmayhew.Greeting;

import java.util.Scanner;

public class Primetime {

    public static void main(String[] args) {
        System.out.print("Please insert a number:");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 2; i < input; i++) {
            if (Primetime.primeChecker(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean primeChecker(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}

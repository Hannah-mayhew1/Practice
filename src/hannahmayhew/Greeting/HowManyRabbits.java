package hannahmayhew.Greeting;

import java.math.BigInteger;
import java.util.Scanner;

public class HowManyRabbits {

    public static void main(String[] args) {

        BigInteger t1 = BigInteger.valueOf(0) ;
        BigInteger t2 = BigInteger.valueOf(1);
        //use big integer here as the fibonacci sequence exceeds the max value of int

        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; ++i) {
            System.out.print(t1 + " ");

            BigInteger sum = t1.add(t2);
            t1 = t2;
            t2 = sum;
        }
    }
}

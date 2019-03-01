package hannahmayhew.Greeting;

import java.util.Scanner;

public class LeapingForJoy {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                int yearsFound = 0;

                for (int year = 2019; yearsFound != input; year++) {
                    if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                        yearsFound = yearsFound + 1;
                        System.out.println(year);

                    } else if ((year % 4 == 0) && (year % 100 != 0)) {
                        yearsFound = yearsFound + 1;
                        System.out.println(year);
                    }


                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }


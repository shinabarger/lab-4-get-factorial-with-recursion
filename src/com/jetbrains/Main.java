package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer;
        Scanner scan = new Scanner(System.in);

        long factorialNumber = 0;
        long userNumber = 0;

        do {
            System.out.println("Please enter any number between 1 & 25 you'd like a factorial of. ");
            userNumber = scan.nextLong();

            if (userNumber > 25 || userNumber < 1) {
                System.out.println("Oops! That wasn't between 1 & 25.");
                System.out.println("Let's try again. Please enter any number between 1 & 25 you'd like a factorial of. ");
                userNumber = scan.nextLong();
            }

            //get the user number and get the factorial of it with this method
            factorialNumber = getFactorialNumber(userNumber);

            //print output to user
            System.out.println("The factorial of " + userNumber + " is " + factorialNumber + ".");

            //asks user if they want to continue
            answer = wantsToContinue(scan);
            if (answer == null) break;
        }
        while (answer.equalsIgnoreCase("Y"));

        //prints when user inputs anything besides Y or y
        System.out.println("Thanks. Have fun out there.");

    }

    private static String wantsToContinue(Scanner scan) {
        String answer;
        scan.nextLine();
        System.out.println("Continue? Y/N");
        answer = scan.nextLine();
        if (!answer.equals("Y")) {
            return null;
        }
        return answer;
    }

    private static long getFactorialNumber(long userNumber) {
        long result;
        {
            if (userNumber < 1) return 1;
            result = getFactorialNumber(userNumber - 1) * userNumber;
        }
        return result;
    }

}


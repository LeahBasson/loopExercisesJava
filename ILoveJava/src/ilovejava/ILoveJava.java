package ilovejava;

import java.util.Scanner;

public class ILoveJava {

    public static void main(String[] args) {
        // Ask user from number between 1 and 10. 
        // Display I love java for that amount of times.

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number between (1 - 10): ");
        int numEntered = scn.nextInt();

        while (numEntered >= 1 && numEntered <= 10) {
            for (int i = 1; i <= numEntered; i++) {
                System.out.println("I love JAVA");
            }

            System.out.print("Enter a number between (1 - 10): ");
            numEntered = scn.nextInt();
        }
        System.out.println("The number entered is not within the range.");

    }

}

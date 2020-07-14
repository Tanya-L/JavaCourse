/**
 * Date: 2020-07-15.
 * File Name: Average.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4_average;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {
    public static double inputAndCountAverage() {
        int n = tryInputCount();
        double sum = tryInputAndSum(n);
        return sum / n;
    }

    private static double tryInputAndSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    double nextNumber = inputNumber(i + 1);
                    sum += nextNumber;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("You entered a non numeric value which is not allowed.\n" +
                            "Please enter the number again.");
                }
            } // infinite loop until nextNumber is good
        }
        return sum;
    }

    private static int tryInputCount() {
        while (true) {
            try {
                return inputCount();
            } catch (NonPositiveNumberException e) {
                System.out.println("Number must be greater than 0");
            }
        } // infinite loop until N is good
    }

    private static double inputNumber(int i) throws NumberFormatException {
        System.out.println("Enter number " + i);
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        return Double.parseDouble(input);
    }

    private static int inputCount() throws NonPositiveNumberException {
        System.out.println("How many numbers do you want to enter?");

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if (number <= 0) {
            throw new NonPositiveNumberException();
        }
        return number;
    }

    public static void main(String[] args) {
        double avg = inputAndCountAverage();

        // round average using the java.text.DecimalFormat class
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Average of the entered numbers is " + df.format(avg));
    }
}







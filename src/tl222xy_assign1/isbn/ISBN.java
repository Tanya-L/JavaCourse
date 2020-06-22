package tl222xy_assign1.isbn;

import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {
        // An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
        //The last digit, d10, is a checksum, which is calculated from the other nine digits using the
        //following formula:
        //(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
        //Note: % represents the modulus operator
        //If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
        //Write a program ISBN.java that prompts the user to enter the first 9 digits and displays the 10-
        //digit ISBN (including leading zeros). Your program should read the input as an integer. Below
        //are two sample runs of the program:
        //Run 1:
        //Enter the first 9 digits of an ISBN as integer: 013601267
        //The ISBN-10 number is: 0136012671
        //Run 2:
        //Enter the first 9 digits of an ISBN as integer: 013031997
        //The ISBN-10 number is 013031997X

        Scanner s = new Scanner(System.in);

        // Enter a 9-digits integer number
        System.out.print("Please, enter the first 9 digits of an ISBN as a integer: ");
        String number = s.next();
        int sum = 0;
        for (int i = 1; i <= number.length(); ++i) {
            int digit = number.charAt(i - 1) - '0';
            sum += (i * digit);
        }

        // Sum of the digits of the integer number
        int d10 = (sum % 11);
        if (d10 == 10) {
            System.out.println("The ISBN-10 number is:" + number + "X");
        } else {
            System.out.println(("The ISBN-10 number is: " + number) + d10);
        }
    }
}
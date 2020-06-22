package tl222xy_assign1.numbers;

import java.util.Scanner;
// Asks the user to enter a three-digit integer number.
// The program then calculates and prints,
// the sum and product of the three digits the integer consists
//of.
//Below is an example of the program execution:
//Enter a three-digit integer number: 483
//Sum of the digits of the integer number is: 15.
//Product of the digits of the integer number is: 96

public class Numbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Enter a three-digit integer number
        System.out.print("Please, enter your a tree-digit integer numbers: ");
        int number = s.nextInt();

        int digit1 = number % 10;
        int temp = number / 10;
        int digit2 = temp % 10;
        temp = temp / 10;
        int digit3 = temp % 10;

        // Sum of the digits of the integer number
        int sum = digit1 + digit2 + digit3;
        System.out.println("Sum of the digits of the integer number " + number + " is: " + sum);

        // Product of the digits of the integer number
        int product = digit1 * digit2 * digit3;
        System.out.println("Product of the digits of the integer number " + number + " is: " + product);

    }
}
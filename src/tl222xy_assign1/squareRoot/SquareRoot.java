package tl222xy_assign1.squareRoot;
// The Babylonian algorithm to compute square root of a positive number n is as follows:
//1. Make a guess at the answer (you can pick n/2 as your initial guess).
//2. Compute r = n / guess.
//3. Set guess = (guess + r) / 2.
//4. Go back to step 2 until the last two guess values are within 1% of each other.
//Write a program SquareRoot.java that prompts user to enter an integer value for n, iterates
//through the Babylonian algorithm until the guess is within 1% of the previous guess and outputs
//the answer as a real number to two decimal places.

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("This program estimate square roots.\n" +
                "Please, enter an integer to estimate the square root of: ");
        double n = s.nextDouble();
        double previous_guess;
        double r;

        // 1. Make a guess at the answer (you can pick n/2 as your initial guess)
        double guess = n / 2;

        do {
            previous_guess = guess;

            //2. Compute r = n / guess.
            r = n / guess;

            //3. Set guess = (guess + r) / 2
            guess = (guess + r) / 2;
            System.out.println("Current guess: " + guess);

            //4. Go back to step 2 until the last two guess values are within 1% of each other.
        } while (Math.abs(guess - previous_guess) / guess > 0.01);
        System.out.printf("The estimated square root of %.2f is %.2f\n", n, guess);
   }
}
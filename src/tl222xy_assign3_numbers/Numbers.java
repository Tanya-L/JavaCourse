/**
 * Date: 2020-07-08.
 * File Name: Numbers.java
 * Author: Tetiana Lytovchenko
 * <p>
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_numbers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program Numbers.java that takes its input from a text file numbers.txt
 * that is provided with this assignment. The text file contains nothing but numeric values,
 * one per line.
 * The program computes average and standard deviation of the numbers in the file.
 * The standard deviation of a list of numbers n1, n2, n3, and so forth is defined as
 * the square root of the average of the following numbers:
 * (n1 - a)2 , (n2 - a)2 , (n3 - a)2 , and so forth.
 * Here, the number a is the average of the numbers n1, n2, n3, and so forth.
 * When we run the program, the computed average and standard deviation should
 * be printed on display screen as well as saved in a text file named “analysis.txt”
 * as shown below:
 * Average: [Display the computed Average here]
 * Standard Deviation: [Display the Standard Deviation here]
 * Note: you MUST use Array(s) to process numbers read from the text files.
 * You are not allowed to use ArrayList or any other library class to store and
 * process the numbers read from the file.
 */

public class Numbers {

    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 08 July 2020
     * @author Tetiana Lytovchenko
     */

    public static void main(String[] args) {
        // Create an array from input data
        int[] numbers = loadNumbers();

        double avg = countAverage(numbers);

        System.out.println("Average: " + avg);
        System.out.println();

        double[] deviations = countStdDev(numbers, avg);
        System.out.println("Standard Deviations: ");
        for (double deviation : deviations) {
            System.out.println("" + deviation + "; ");
        }
        System.out.println();

        // method for writing to a text file
        saveFile(avg, deviations);
    }

    private static double[] countStdDev(int[] numbers, double avg) {
        double[] deviations = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            double diff = numbers[i] - avg;
            deviations[i] = diff * diff;
        }

        return deviations;
    }

    private static double countAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // read data from the file
    private static int[] loadNumbers() {
        int count = 0;

        // Count input size
        Scanner input = openNumbersFile();
        while (input.hasNextInt()) {
            count++;
            input.nextInt();
        }
        input.close();

        // Create int array
        int[] numbers = new int[count];

        // Load numbers
        input = openNumbersFile();
        int i = 0;
        while (input.hasNextInt()) {
            numbers[i] = input.nextInt();
            i++;
        }
        input.close();

        return numbers;
    }

    //    open data from the file
    private static Scanner openNumbersFile() {
        Scanner input;
        try {
            String p = "/Users/tanya/Project/education/Java_courses/src/tl222xy_assign3_numbers/";
            input = new Scanner(new FileInputStream(p + "numbers.txt"));
            return input;
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
            System.exit(1);
        }
        return null;
    }

    //    write and save our result to new file
    public static void saveFile(double avg, double[] deviations) {
        PrintWriter writer = null;
        FileOutputStream fileOS;
        try {
            fileOS = new FileOutputStream("analysis.txt");
            writer = new PrintWriter(fileOS);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error opening the file analysis.txt");
            System.exit(1);
        }
        writer.println("Average: " + avg);
        writer.println("Standard Deviations: ");
        for (double deviation : deviations) {
            writer.println("" + deviation + "; ");
        }
        writer.close();
        System.out.print("Data saved in file analysis.txt");
    }
}

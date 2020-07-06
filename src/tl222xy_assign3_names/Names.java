/**
 * Date: 2020-07-06.
 * File Name: Names.java
 * Author: Tetiana Lytovchenko
 * <p>
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_names;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * The text files boynames.txt and girlnames.txt, provided with the assignment,
 * each contains a list of 1,000 most popular boys’ and girls’ names in the United States
 * for the year 2003 as compiled by the Social Security Administration.
 * <p>
 * These are blank-delimited files, where the most popular name is listed first,
 * the second most popular name is listed second, and so on, to the 1,000th most popular name,
 * which is listed last. Each line consists of the first name followed by a blank space and
 * then the number of registered births using that name in the year. For example,
 * the girlnames.txt file contains
 * Emily 25494
 * Emma 22532
 * Madison 19986
 * This indicates that Emily was the most popular name with 25,494 registered names,
 * Emma was the second most popular with 22,532, and Madison was the third most popular with 19,986.
 * Write a program Names.java that reads both the girl and boy files into memory using arrays.
 * Then, allow the user to input a name. The program should search through both arrays.
 * If there is a match, then it should output the popularity ranking and the number of namings.
 * The program should also indicate if there is no match.
 * For example, if the user enters the name “Justice,” then the program should output
 * Justice is ranked 456 in popularity among girls with 655 namings.
 * Justice is ranked 401 in popularity among boys with 653 namings.
 * <p>
 * If the user enters the name “Walter,” then the program should output
 * Walter is not ranked among the top 1000 girl names.
 * Walter is ranked 356 in popularity among boys with 775 namings.
 * <p>
 * Note: you MUST use Array(s) to process names read from the files.
 * You are not allowed to use ArrayList or any other library class
 * to store and process the data read from the files.
 */


public class Names {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @author Tetiana Lytovchenko
     * @version 1.0 06 July 2020
     */
    public static class NameCountPair {
        String name;
        int count;

        public NameCountPair(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    NameCountPair[] boys;
    NameCountPair[] girls;

    public static NameCountPair[] readData(String fileName) {
        NameCountPair[] names = new NameCountPair[1000];
        try {
            String line;
            int countNum = 0;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                names[countNum] = new NameCountPair(data[0], Integer.parseInt(data[1]));
                countNum++;
            }
            System.out.println("Loaded " + countNum + " names");
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return names;
    }

    private String inputName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter a boy or girl name: ");
        return s.next();
    }

    private void findName(NameCountPair[] array, String findThisName, String girlsBoys) {
        for (int i = 0; i < 1000; i++) {
            if (array[i].name.equalsIgnoreCase(findThisName)) {
                System.out.println(findThisName + " is ranked " + (i + 1)
                        + " in popularity among " + girlsBoys + " with "
                        + array[i].count + " namings.");
                return;
            }
        }
        System.out.println(findThisName + " is not ranked among the top 1000 "
                + girlsBoys + " names.");
    }

    public static void main(String[] args) {
        Names names = new Names();
        String p = "/Users/tanya/Project/education/Java_courses/src/tl222xy_assign3_names/";

        names.girls = readData(p + "girlnames.txt");
        names.boys = readData(p + "boynames.txt");

        String findThisName = names.inputName();
        names.findName(names.girls, findThisName, "girls");
        names.findName(names.boys, findThisName, "boys");
    }
}

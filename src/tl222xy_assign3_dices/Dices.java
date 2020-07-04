/**
 * Dices.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign3_dices;

import java.util.Random;

/**
 * Write a program Dices.java that simulates that you are rolling two dices 10000 times. You
 * should use the java.util.Random class to simulate the dices. The program is required to add
 * the values of the two dices, and keep track of the number of times you get a same result after
 * adding the dice values, i.e., frequency of each value produced as a sum of the two dice
 * values. The minimum value we can get with a dice is 1 and maximum value we can get with
 * a dice is 6. Thus the sum of two dice values ranges from 2 to 12 as shown in the example
 * execution below. The program must display each of the sum value and its frequency as
 * shown below:
 * Frequency table (sum, count) for rolling two dices 10000 times is:
 * 2 267
 * 3 555
 * 4 833
 * 5 1101
 * 6 1346
 * 7 1690
 * 8 1399
 * 9 1083
 * 10 862
 * 11 580
 * 12 284
 */

public class Dices {
    public static int N = 10000;  // total rolls

    public static int roll(Random r) {
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] dices = new int[13];

        for (int d = 1; d < 13; d++) {
            dices[d] = 0;
        }

        for (int x = 0; x < N; x++) {
            dices[roll(r) + roll(r)]++;
        }

        System.out.println("Rolls: " + N);

        for (int d = 2; d < 13; d++) {
            System.out.println(" " + d + " " + dices[d]);
        }

    }

}

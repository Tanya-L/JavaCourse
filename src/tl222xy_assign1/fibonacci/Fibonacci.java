package tl222xy_assign1.fibonacci;
// Each new term in the Fibonacci sequence is generated by adding the previous two terms. By
//starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
//Write a program Fibonacci.java that prints a Fibonacci sequence starting with 1 and 2 and
//whose values do not exceed one thousand. The program should also compute and print a sum of
//the odd-valued terms in the required Fibonacci sequence.

public class Fibonacci {

    public static void main(String[] args) {
        int maxNumber = 1000;
        int previousNumber = 0;
        int nextNumber = 1;
        int oddSum = 0;

        System.out.print("Fibonacci sequence upto " + maxNumber + " : ");
        // using WHILE loop, compare the sum of last two number with maximum number 1000 in this case.
        // If next number is less or equals to maxNumber, should be print, else - stop.

        while (true) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if (nextNumber > maxNumber) {
                break;
            }
            System.out.print(nextNumber + " ");

            // Compute and print a sum of the odd-valued terms in the required Fibonacci sequence.
            if (nextNumber % 2 == 1) {
                oddSum += nextNumber;
            }
        }
        System.out.print("\nSum of odd elements of Fibonacci sequence upto " + maxNumber + " : " + oddSum);
    }
}
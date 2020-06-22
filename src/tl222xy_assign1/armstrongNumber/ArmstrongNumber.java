package tl222xy_assign1.armstrongNumber;
//Write a program ArmstrongNumber.java that prompts user to enter a range for Armstrong
//numbers. The range is entered by asking user to enter a starting and an ending number for the
//range. The program then computes and prints Armstrong number, if any, in the entered range.
//Next, the program should prompt for a new range until the user decides that she or he is through.
//Use variables of the type integer to store the start and end numbers of the range.

import java.util.Scanner;

public class ArmstrongNumber {

    //An Armstrong number is an n-digit number that equals the sum of the nth power of its digits. For
    //example 153 is a three-digit number where the sum of the cubes of the individual digits (1 + 125
    //+ 27) equals the number itself (153).
    int num;

    int armNum(int n, int a) {
        if (n != 0) {
            num = n % 10;
            a = a + (num * num * num);
            n /= 10;
            return armNum(n, a);
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArmstrongNumber A = new ArmstrongNumber();
        int arm;

        while (true) {
            // Enter the starting number of the range
            System.out.print("Please, enter the starting number of the range: ");
            int startRange = s.nextInt();
            // Enter the ending number of the range
            System.out.print("Please, enter the ending number of the range: ");
            int stopRange = s.nextInt();

            for (int number = startRange; number <= stopRange; number++) {
                arm = A.armNum(number, 0);
                if (arm == number) {
                    System.out.println("The Armstrong numbers between the given range are: " + number);
                };

            }
            // Repeat
            System.out.print("Do you want to repeat? (Y/N): ");
            String yesno = s.next();
            if (!yesno.equals("Y") && !yesno.equals("y")) {
                System.out.println("Good bye");
                break;
            }
        } // while true
    }
}
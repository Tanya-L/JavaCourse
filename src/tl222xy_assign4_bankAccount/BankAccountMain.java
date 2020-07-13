/**
 * Date: 2020-07-13.
 * File Name: BankAccountMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4_bankAccount;

/**
 * Define a class BankAccount.java that provides functionality to open a bank account. When
 * we execute this class it prints a welcome message and prompts user to enter customer ID,
 * account number, and initial balance as shown in the below example execution of the
 * program. The bank uses following criteria to validate the entered values of the customer ID,
 * account number, and initial balance:
 * a) Customer ID must start with a letter (Aa-zZ), which is then followed by three digits.
 * b) Account number must be of seven digits.
 * c) Initial balance must be equal to or higher than 1000.
 * The program must use the try-catch exception handling mechanism to check for the validity
 * of the values entered by a user based on the above-specified criteria. If any of the criteria
 * mentioned above is not fulfilled, the program must print a suitable warning/error message
 * and ask the user to re-enter the data.
 * Executing the BankAccount.java shall result in following user interaction:
 * <p>
 * Welcome to the Bank of Students, By the Students, for the Students!
 * Enter customer ID : aa52
 * Incorrect Customer ID. The Customer ID must start with a letter
 * followed by three digits
 * Input Again
 * Enter customer ID : a123
 * Enter account no : 255
 * Incorrect Account No. The Account number must be of five digits.
 * Input Again
 * Enter account no : 1235467
 * Enter balance : 100
 * Initial balance must be equal to or higher than 1000
 * Input Again
 * Enter balance : 1001
 * Congratulations, your account has been create successfully!
 */


public class BankAccountMain {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 13 July 2020
     * @author Tetiana Lytovchenko
     */

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank of Students, By the Students, for the Students! ");
        BankAccount ba = new BankAccount();

        System.out.println("Enter balance: " + ba.InitialBalance);
        System.out.println("Congratulation, your account has been created successfully!");
    }

}

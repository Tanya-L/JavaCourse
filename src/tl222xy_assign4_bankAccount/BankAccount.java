/**
 * Date: 2020-07-13.
 * File Name: BankAccount.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4_bankAccount;

import java.util.Scanner;

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


public class BankAccount {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 13 July 2020
     * @author Tetiana Lytovchenko
     */

    public String CustomerID;
    public String AccountNum;
    public int InitialBalance;

    public BankAccount() {
        CustomerID = inputCustomerId();
        AccountNum = inputAccountNum();
        InitialBalance = inputInitialBalance();
    }

    private static int inputInitialBalance() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter balance: ");
                int initialBalance = s.nextInt();

                // Initial balance must be equal to or higher than 1000.
                if (initialBalance < 1000) {
                    throw new IllegalArgumentException();
                }

                return initialBalance;
            } catch (IllegalArgumentException e) {
                System.out.println("Initial balance must be equal to or higher than 1000");
                System.out.println("Input Again: ");
            }
        } // infinite loop
    }

    private static String inputAccountNum() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter account number: ");
                String accountNum = s.nextLine();

                // Account number must be of seven digits.
                if (!isValidAccountNum(accountNum)) {
                    throw new IllegalArgumentException();
                }
                return accountNum;
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect Account Number. The Account Number must be of seven digits");
                System.out.println("Input Again: ");
            }
        } // infinite loop
    }

    private static boolean isValidAccountNum(String accountNum) {
        return accountNum.matches("\\d{7}");
    }

    private static String inputCustomerId() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter customer ID: ");
                String customerID = s.nextLine();

                // Customer ID must start with a letter (Aa-zZ), which is then followed by three digits.
                if (!isValidCustomerID(customerID)) {
                    throw new IllegalArgumentException();
                }

                return customerID;
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect Customer ID. The customer ID must start with " +
                        "a letter followed by three digits.");
                System.out.println("Input Again: ");
            }
        } // infinite loop
    }

    private static boolean isValidCustomerID(String customerID) {
        return customerID.matches("[A-Za-z]\\d\\d\\d");
    }

}

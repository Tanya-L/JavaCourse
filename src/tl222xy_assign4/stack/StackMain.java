/**
 * Date: 2020-07-13.
 * File Name: StackMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.stack;

import tl222xy_assign4_bankAccount.BankAccount;

/**
 * Write a test program StackMain.java that instantiates an object of the StackImpl class
 * and demonstrates use of all methods of the StackImpl.
 * Note: You must use an array to store stack elements. Increase the array size by two times
 * when it becomes full and there is no more room to add a new element. You are not
 * allowed to use ArrayList or any other library class to store stack elements.
 */


public class StackMain {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 13 July 2020
     * @author Tetiana Lytovchenko
     */
    public static void main(String[] args) {
        //creating an empty Stack
        StackImpl stack = new StackImpl(10);

        stack.push(new BankAccount("T123", "1234567", 1500));
        stack.push(new BankAccount("T234", "1234567", 2500));
        stack.push(new BankAccount("T345", "1234567", 3500));
        stack.pop();
        stack.pop();
        stack.peek();
        stack.pop();

        // Here stack should be empty
        try {
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println("The stack was empty, and it was good");
        }

        stack.push(new BankAccount("T456", "1234567", 4500));

        System.out.println("Account returns (without removing) top element " + stack.peek());
        System.out.println("Account returns and removes at top " + stack.pop());

        // Here stack should be empty
        System.out.println("Stack here should be empty again. Size = " + stack.size());
    }

}

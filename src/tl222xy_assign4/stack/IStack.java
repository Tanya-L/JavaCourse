/**
 * Date: 2020-07-13.
 * File Name: IStack.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.stack;

import tl222xy_assign4_bankAccount.BankAccount;

/**
 * Class Description: This class provides logic
 * for solving exercise.
 *
 * @author Tetiana Lytovchenko
 * @version 1.0 13 July 2020
 */

public interface IStack {
    // returns current number of elements (accounts) in the stack
    int size();

    // true if stack is empty
    boolean isEmpty();

    // Adds an account at the top of the stack.
    void push(BankAccount account);

    // returns and removes an account at top, throws an exception if stack is empty
    BankAccount pop() throws StackUnderflowException;

    // returns (without removing) top element, throws an exception if stack is empty.
    BankAccount peek() throws StackUnderflowException;
}

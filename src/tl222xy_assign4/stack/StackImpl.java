/**
 * Date: 2020-07-13.
 * File Name: StackImpl.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.stack;

/**
 * Class Description: This class provides logic
 * for solving exercise.
 *
 * @version 1.0 13 July 2020
 * @author Tetiana Lytovchenko
 */

import tl222xy_assign4_bankAccount.BankAccount;

/**
 * Start this exercise by creating a new sub package named stack inside your package
 * YourLnuUserName_assign4 and save all .java files related to this exercise inside this
 * package.
 * A stack is a LiFo (Last-in, first-out) data structure with three basic operations: push, pop and
 * peek. push puts an element on the top of the stack, pop removes (and returns) the top
 * element, and peek returns (without removing) the top element. Think of a stack as a pile of
 * plates that can be found in a restaurant where you can only add and remove plates at the top.
 * You cannot remove plates from middle of the pile (without first removing all plates above
 * it).
 * Your task is to write a class StackImpl.java which implement the following stack interface:
 * public interface Stack {
 * int size();                       // returns current number of elements
 * // (accounts) in the stack
 * boolean isEmpty();               // true if stack is empty
 * void push(BankAccount account);  // Adds an account at the top of the stack.
 * BankAccount pop();              // returns and removes an account at top,
 * // throws an exception if stack is empty
 * BankAccount peek();             // returns (without removing) top element,
 * // throws an exception if stack is empty.
 * }
 * • Here BankAccount is the class that you write for Exercise 1.
 * • Illegal operations on an empty stack (e.g., pop() and peek()) should result in a
 * meaningful exception.
 * • Write a test program StackMain.java that instantiates an object of the StackImpl class
 * and demonstrates use of all methods of the StackImpl.
 * Note: You must use an array to store stack elements. Increase the array size by two times
 * when it becomes full and there is no more room to add a new element. You are not
 * allowed to use ArrayList or any other library class to store stack elements.
 */


public class StackImpl implements IStack {
    BankAccount[] stack;
    int elementCount;

    public StackImpl(int capacity) {
        this.elementCount = 0;
        this.stack = new BankAccount[capacity];
    }

    @Override
    public int size() {
        return this.elementCount;
    }

    @Override
    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override
    public void push(BankAccount account) {
        if (this.elementCount == this.stack.length) {
            this.growStack();
        }

        this.stack[this.elementCount] = account;
        this.elementCount++;
        System.out.println("Bank account added at the top of the stack");
    }

    // Double stack capacity and move elements over
    private void growStack() {
        BankAccount[] newStack = new BankAccount[this.stack.length * 2];
        // copy data
        for (int i = 0; i < this.elementCount; i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
    }

    @Override
    public BankAccount pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException();
        }
        this.elementCount--;
        BankAccount top = this.stack[this.elementCount];
        this.stack[this.elementCount] = null;
        return top;
    }

    @Override
    public BankAccount peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException();
        }
        return this.stack[this.elementCount - 1];
    }
}

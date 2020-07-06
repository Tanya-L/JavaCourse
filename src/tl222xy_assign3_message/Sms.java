/**
 * Date: 2020-07-07.
 * File Name: Sms.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_message;

/**
 * Next, define a class named SMS that is derived from the class Message and includes
 * following:
 * • an instance variables for the recipientContactNo.
 * - Decide a suitable type for the recipientContactNo yourself and document
 * reasoning for the chosen type by adding comments to the variable
 * declaration.
 * • A constructor with a parameter for recipientContactNo and another parameter for the
 * inherited field text
 * • implement accessor and mutator methods for the recipientContactNo.
 * • textual contents of the SMS message should be stored in the inherited variable text.
 * • toString method should be redefined so that it returns values of both
 * recipientContactNo and the inherited text field
 */


public class Sms extends Message {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 07 July 2020
     * @author Tetiana Lytovchenko
     */
    String recipientContactNo;

    public Sms(String recipientContactNo, String text) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return "You have sms from: " + recipientContactNo + '\'' + " " + this.text;
    }
}


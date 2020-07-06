/**
 * Date: 2020-07-07.
 * File Name: Email.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_message;

/**
 * Similarly, define another class named Email that is also derived from the Message class.
 * The Email class includes following:
 * • three instance variables to record the Email sender, receiver, and subject data.
 * -  Decide a suitable type for each of the three variables, and document
 * reasoning for the chosen type by adding comments to each variable
 * declaration.
 * • A constructor with a parameter for each of the above specified instance variables and
 * a fourth parameter for the inherited field text
 * • implement accessor and mutator methods for each of the above three instance
 * variables.
 * • textual contents of the Email, i.e., the message, should be stored in the inherited
 * variable text.
 * • toString method should be redefined so that and it returns a String that provides
 * suitable representation of the Email object, that is it should return a String containing
 * values of all the three instance variables sender, receiver, subject, and the inherited
 * text field
 */


public class Email extends Message {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 07 July 2020
     * @author Tetiana Lytovchenko
     */

    String sender;
    String recipient;
    String subject;

    public Email(String sender, String recipient, String subject, String text) {
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "This is Email from: " +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + this.text + '\'';
    }
}


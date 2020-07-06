/**
 * Date: 2020-07-07.
 * File Name: MessagingMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_message;

/**
 * Finally, define a test program MessagingMain.java that creates objects of all the three
 * classes, Message, SMS, and Email, and demonstrate use of all their member methods and
 * the encode method.
 */

public class MessagingMain {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 07 July 2020
     * @author Tetiana Lytovchenko
     */

    public static void main(String[] args) {
        // Create object for all classes
        Message m = new Message("Hello");
        Sms s = new Sms("1", "Hello from sms");
        Email e = new Email("E", "A", "Apple", "Try it");

        // Demonstrate all methods from Message class
        m.setText("This is Java!");
        System.out.println(m.toString());
        System.out.println("Encode message: " + m.encode());
        System.out.println();

        // Demonstrate all methods from SMS class
        s.setRecipientContactNo("123456789");
        System.out.println(s.getRecipientContactNo());
        System.out.println(s.toString());
        System.out.println("Encode sms: " + s.encode());
        System.out.println();

        // Demonstrate all methods from Email class
        e.setSender("Eva");
        e.setRecipient("Adam");
        e.setSubject("Apple");
        System.out.println(e.getSender());
        System.out.println(e.getRecipient());
        System.out.println(e.getSubject());
        System.out.println(e.toString());
        System.out.println("Encode text: " + e.encode());
    }


}


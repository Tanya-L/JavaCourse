/**
 * Date: 2020-07-07.
 * File Name: Message.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_message;

/**
 * Define a class named Message that contains followings:
 * • an instance variable of type String named text that stores any textual content for the
 * Message.
 * • a method named toString that returns the instance variable text
 * • a setter method named setText to set a value of the instance variable text.
 * <p>
 * We require a method named encode that produces and returns encoded form of the textual
 * contents property of all the three classes without making any changes in the original text.
 * This means original textual contents should remain unchanged. It is you who should decide
 * which of the three classes should actually contain the encode method.
 * The encoding is done by replacing each alphabetic character (aA to zZ) with the character
 * that comes after it. For example, if the message contains character B or b, it should be
 * replaced by C or c accordingly, while Z or z should be replaced with an A or a. If the
 * original text is “This is Java!”, then the encoded message returned by the encode method
 * should be “Uijt jt Kbwb!”. Any non-alphabetic characters (all characters other than aA to
 * zZ), such as !, #, @, etc., in the original text should remain unchanged.
 * Finally, define a test program MessagingMain.java that creates objects of all the three
 * classes, Message, SMS, and Email, and demonstrate use of all their member methods and
 * the encode method.
 */


public class Message {


    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 07 July 2020
     * @author Tetiana Lytovchenko
     */

    String text;

    public Message(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String encode() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 'A' && c <= 'Y') || (c >= 'a' && c <= 'y')) {
                result.append((char) (c + 1));
            } else if (c == 'Z') {
                result.append('A');
            } else if (c == 'z') {
                result.append('a');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}




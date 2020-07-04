/**
 * Date: 2020-07-04.
 * File Name: Email.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign3_message;

/**
 * Similarly, define another class named Email that is also derived from the Message class.
 * The Email class includes following:
 * • three instance variables to record the Email sender, receiver, and subject data.
 *  -  Decide a suitable type for each of the three variables, and document
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
 * */


public class Email {
/**
 * Class Description: This class provides logic
 * for solving exercise.
 *
 * @version 1.0 04 July 2020
 * @author Tetiana Lytovchenko
 */
}


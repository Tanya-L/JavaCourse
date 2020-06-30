/**
 * SweId.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_sweID;

/*
* Create a class SweID.java that apart from the main method
* also contains a number of static methods related to
* the Swedish identity number in the form YYMMDD-NNNN.
* We expect you to consider each ID number
* as a single string of format "YYMMDDNNNN".
* The class SweID is required to contain the following static methods:
Methods getFirstPart(String sweID) and getSecondPart(String sweID),
* returning the first part (YYMMDD) and second part (NNNN) of
* the identity number, respectively.
* isFemaleNumber(String sweID), returning true if the personal
* identity number belongs to a woman.
* areEqual(String id1, String id2), comparing two ID numbers checking
* if they correspond to the same identity number.
* isCorrect(String sweID), returning true if the number is a
* correct identity number. To get a passed result you have to check
* that the date is correct (i.e. the year, month and day should be correct).
* You must also check that the last digit of the number is correct
* according to the rules given in the link above.
* Suitable types for the return values are up to you to decide.
*/

import java.util.Scanner;

public class SweID {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String number1 = inputPersonalNumber(s);
        String number2 = inputPersonalNumber(s);
        if (areEqual(number1, number2)) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are NOT equal");
        }
    }

    private static String inputPersonalNumber(Scanner s) {
        // Enter a 10-digits number from user
        String number;
        while (true) {
            System.out.print("Please, enter your person number in YYMMDD-NNNN: ");
            number = s.next();
            if (isCorrect(number)) {
                break;
            }
            System.out.println("Bad ID, try again. Must contain 6 digits, dash and 4 more digits");
        }

        System.out.println("First part is " + getFirstPart(number));
        System.out.println("Second part is " + getSecondPart(number));
        System.out.println("The gender of the personal number is: " +
                (isFemaleNumber(number) ? "female" : "male"));
        return number;
    }

    // Check that S is 11 characters long, contains 6 digits, dash and 4 digits
    private static boolean isCorrect(String s) {
        if (s.length() == 11) {
            // Year is 2 digits
            if (!s.matches("\\d\\d\\d\\d\\d\\d[-+]\\d\\d\\d\\d")) {
                System.out.println("Does not match YYMMDD-NNNN");
                return false;
            }

            int month = Integer.parseInt(s.substring(2, 4));
            if (month < 1 || month > 12) {
                System.out.println("Month is not in range 1..12: month=" + month);
                return false;
            }

            int day = Integer.parseInt(s.substring(4, 6));
            if (day < 1 || day > 31) {
                System.out.println("Day is not in range 1..31: day=" + day);
                return false;
            }

            // Using Luhn's algorithm for checksum
            boolean doubleFlag = true;
            int checksum = 0;
            for (int i = s.length() - 2; i >= 0; i--) {
                char c = s.charAt(i);
                if (c == '-') {
                    continue;
                }
                int digit = c - '0';
                if (doubleFlag) {
                    digit *= 2;
                }
                doubleFlag = !doubleFlag;
                if (digit > 9) {
                    digit = 1 + digit % 10;
                }
                checksum += digit;
            }
            int checksumDigit = (checksum * 9) % 10;
            if (s.charAt(s.length() - 1) - '0' != checksumDigit) {
                System.out.println("Check digit does not match, expected " + checksumDigit);
                return false;
            }
            return true;
        } else if (s.length() == 13) {
            System.out.println("The program does not implement SweID with 4-digit years");
            return false;
        } else {
            return false;
        }
    }

    static String getFirstPart(String s) {
        return s.split("-", 2)[0];
    }

    static String getSecondPart(String s) {
        return s.split("-", 2)[1];
    }

    static boolean isFemaleNumber(String s) {
        return s.charAt(s.length() - 2) % 2 == 0;
    }

    public static boolean areEqual(String id1, String id2) {
        return id1.equals(id2);
    }
}

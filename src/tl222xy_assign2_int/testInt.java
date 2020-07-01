/**
 * testInt.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_int;

public class testInt {

    // Data members or fields
    static Int i1 = new Int(5);
    static Int i2 = new Int(2);
    static Int sum = i1.plus(i2);
    static Int div = i1.div(i2);

    // Main method
    public static void main(String[] args) {

        if (sum.isLargerThan(i1)) {
            System.out.println("Sum " + sum.toString() + " is larger than " + i1.toString());
        };

        if (div.isEqualTo(i2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("They are not equal");
        };

    }
}

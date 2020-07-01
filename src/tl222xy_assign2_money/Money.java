/**
 * Money.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_money;

import org.w3c.dom.ranges.RangeException;

/**
 * Write a program Money.java that defines a class named Money whose objects represent
 * amounts of U.S. money. The class shall have:
 * - Two instance variables of type int for the dollars and cents in the amount of money.
 * - A constructor with two parameters of type int for the dollars and cents,
 * - Another constructor with one parameter of type int for an amount of dollars. It should set cents to zero
 * - A no-argument constructor.
 * - Methods add and minus for addition and subtraction of amounts of money,
 * respectively. Both these methods should be static methods, each should have two
 * parameters of type Money, and return a value of type Money.
 * - A set of accessor and mutator methods to get and set values of the two instance
 * variables.
 */
public class Money {

    int dollars;
    int cents;

    // A no-argument constructor
    public Money() {
        dollars = 0;
        cents = 0;
    }

    // A constructor with one parameter of type int for an amount of dollars.
    // It should set cents to zero.
    public Money(int dollars) {
        this.dollars = dollars;
        cents = 0;
    }

    // A constructor with two parameters of type int for the dollars and cents
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    // Methods add and minus for addition and subtraction of amounts of money,
    // respectively. Both these methods should be static methods, each should have two
    // parameters of type Money, and return a value of type Money.
    public static Money add(Money a, Money b) {
        int aCents = a.dollars * 100 + a.cents;
        int bCents = b.dollars * 100 + b.cents;
        int cCents = aCents + bCents;
        return new Money(cCents / 100, cCents % 100);
    }

    public static Money minus(Money a, Money b) {
        int aCents = a.dollars * 100 + a.cents;
        int bCents = b.dollars * 100 + b.cents;
        int cCents = aCents - bCents;
        if (cCents < 0) {
            throw new RangeException((short) 0, "Negative money not supported");
        }
        return new Money(cCents / 100, cCents % 100);
    }

    @Override
    public String toString() {
        return "$"
                + dollars
                + "."
                + (cents < 10 ? "0" : "") + cents;
    }

    // A set of accessor and mutator methods to get and set values of the two instance variables.
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}

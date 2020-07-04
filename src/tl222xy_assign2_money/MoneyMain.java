/**
 * MoneyMain.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_money;

/**
 * Write a Test program MoneyMain.java that demonstrates use of the Money class by
 * creating two objects of type Money and uses these objects to produce following output
 * when we run the MoneyMain.java.
 * Money 1 is: $2,00
 * Money 2 is: $5,05
 * Money1's dollars are: 2
 * Money1's cents are: 0
 * Money2's dollars are: 5
 * Money2's cents are: 5
 * Adding money1 and money2: $7,05
 * Subtracting money1 from money2: $3,05.
 */
public class MoneyMain {

    public static void main(String[] args) {
        Money m1 = new Money(2, 0);
        Money m2 = new Money(5, 05);

        System.out.println("Money 1 is: " + m1);
        System.out.println("Money 2 is: " + m2);

        System.out.println("Money1's dollars are: " + m1.dollars);
        System.out.println("Money1's cents are: " + m1.cents);
        System.out.println("Money2's dollars are: " + m2.dollars);
        System.out.println("Money2's cents are: " + m2.cents);
        System.out.println("Adding money1 and money2: " + Money.add(m1, m2));
        System.out.println("Subtracting money1 from money2: " + Money.minus(m2, m1));

    }


}

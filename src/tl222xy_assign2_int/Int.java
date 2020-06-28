/**
 * Int.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_int; //package declaration for Step 2 Practical Assignment #2

/**
 * Write down a Java program Int.java that defines an integer class Int that when executed
 * using below code:
 * Int i1 = new Int(5);
 * Int i2 = new Int(2);
 * Int sum = i1.plus(i2); // the plus method adds i1 and i2 and returns
 * // result of the addition, resulting sum = 7
 * Int div = i1.div(i2);  // the div method divides i1 by i2 and returns
 * // result of the division, resulting div = 2
 * if ( sum.isLargerThan(i1) )
 * System.out.println("Sum "+ sum.toString()+ " is larger than " +i1.toString() );
 * <p>
 * if ( div.isEqualTo(i2) )
 * System.out.println("Both are equal");
 * else
 * System.out.println("They are not equal");
 * <p>
 * results in the following console output:
 * Sum Int(7) is larger than Int(5)
 * Both are equal
 * <p>
 * Methods of the class Int must work properly for any integer value.
 * We expect the Int class to contain at least followings:
 * • a constructor and
 * • member methods plus, div, isLargerThan, isEqualTo , and toString.
 * Notice that methods like plus and div take an Int type object as input and return an Int
 * type object which is result.
 * Don’t forget to follow the code conventions for this and other tasks of the assignment.
 */

public class Int {

    /* fields or data members */
    int value;

        /*  construct a integer object */
        public Int( int v){
            value = v;
        }

        /* Members methods */
        //    the plus method adds i1 and i2 and returns result of the addition
        public Int plus (Int a){ //methods header
            return new Int(value + a.value); //methods body with return value
        }

        // the div method divides i1 by i2 and returns result of the division
        public Int div (Int b){
            return new Int(value / b.value);
        }

        boolean isLargerThan (Int c){
            return value > c.value;
        }

        boolean isEqualTo (Int d){
            return value == d.value;
        }

        @Override
        public String toString () {
            return "" + value;
        }
    }


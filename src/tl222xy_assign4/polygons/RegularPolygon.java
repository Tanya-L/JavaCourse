/**
 * Date: 2020-07-14.
 * File Name: RegularPolygon.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */
package tl222xy_assign4.polygons;

/**
 * Define followings interfaces and classes:
 * a. An interface called RegularPolygon with following methods.
 * i. two abstract methods:
 * • getNumSides that returns number of sides for a regular polygon
 * • getSideLength that returns length of a side in a regular polygon
 * ii. two default methods:
 * • getPerimeter that returns perimeter of a regular polygon. Perimeter of
 * a regular polygon is computed as follows: n * length, here n is the
 * number of sides and length is length of a side in a polygon.
 * • getInteriorAngle that returns measure of the interior angle of a regular
 * polygon in degrees. The formula to compute interior angle of a
 * polygon in degrees is: (n-2) * 180, here n is the number of sides.
 * iii. a static method named totalSides that takes an array of type RegularPolygon
 * as an input argument and returns a sum of the number of sides of all the
 * RegularPolygons passed as an array.
 */

public interface RegularPolygon {
    int getNumSides();
    double getSideLength();

    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        return (getNumSides() - 2.0) * 180.0;
    }

    static int totalSides(RegularPolygon[] polygons) {
        int sum = 0;
        for (int i = 0; i < polygons.length; i++) {
            sum += polygons[i].getNumSides();
        }
        return sum;
    }
}

/**
 * Date: 2020-07-14.
 * File Name: RegularPolygonMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.polygons;

/**
 * Define followings interfaces and classes:
 * b. A class EquilateralTriangle that implements the interface RegularPolygon in a way
 * that the getNumSides method returns 3 and getSideLength method returns an instance
 * variable that is set by constructor of the class EquilateralTriangle.
 */
public class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return this.sideLength;
    }


}

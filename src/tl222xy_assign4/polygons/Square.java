/**
 * Date: 2020-07-14.
 * File Name: RegularPolygonMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.polygons;

/**
 * Define followings interfaces and classes:
 * c. A class Square that implements the interface RegularPolygon in a way that the
 * getNumSides returns 4 and getSideLength returns an instance variable that is set by
 * the constructor of the class Square.
 */
public class Square implements RegularPolygon {
    private double squareSideLength;

    public Square(double squareSideLength) {
        this.squareSideLength = squareSideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return this.squareSideLength;
    }
}


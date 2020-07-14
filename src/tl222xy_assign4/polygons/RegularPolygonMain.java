/**
 * Date: 2020-07-14.
 * File Name: RegularPolygonMain.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign4.polygons;

/**
 * Define followings interfaces and classes:
 * d. A test class RegularPolygonMain.java that defines a main method to create a couple
 * of instances of the above specified classes and demonstrate use of all their methods.
 */
public abstract class RegularPolygonMain implements RegularPolygon {

    public static void main(String[] args) {
        RegularPolygon s = new Square(4.0);
        RegularPolygon t = new EquilateralTriangle(5.0);

        System.out.println("Square: Number of sides: " + s.getNumSides());
        System.out.println("Square: Side length: " + s.getSideLength());
        System.out.println("Square: Perimeter: " + s.getPerimeter());
        System.out.println("Square: Interior angle: " + s.getInteriorAngle());

        System.out.println("Triangle: Number of sides: " + t.getNumSides());
        System.out.println("Triangle: Side length: " + t.getSideLength());
        System.out.println("Triangle: Perimeter: " + t.getPerimeter());
        System.out.println("Triangle: Interior angle: " + t.getInteriorAngle());

        System.out.println("Total sides of square and triangle: "
                + RegularPolygon.totalSides(new RegularPolygon[] {s, t}));
    }
}

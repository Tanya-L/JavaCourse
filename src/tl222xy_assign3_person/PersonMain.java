/**
 * Date: 2020-07-04.
 * File Name: PersonMain.java
 * Author: Tetiana Lytovchenko
 * <p>
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign3_person;

import java.util.Date;

/**
 * Write a test program PersonMain.java that creates objects of all the above classes
 * namely Person, Student, Employee, Faculty, and Staff, and invokes toString()
 * method on each of the created object.
 * */

public class PersonMain {
    /**
     * Class Description: This class provides logic
     * for solving the problem using the Random method from the java.util library.
     *
     * @version 1.0 04 July 2020
     * @author Tetiana Lytovchenko
     */

    public static void main(String[] args) {
        Person p = new Person("Tanya", "Stockholm",
                "123456789", "t@t.se");
        System.out.println("Person info: ");
        System.out.println(p.toString());
        System.out.println();


        Person.Student s = new Person.Student("Tanya", "Stockholm",
                "123456789", "t@t.se", "Junior" );

        System.out.println("Student info: ");
        System.out.println(s.toString());
        System.out.println();

        Person.Employee e = new Person.Employee("Jon Dow ", "Uppsala",
                "123456789", "t@t.se", new Date(2020, 7, 4), 25000.0);
        System.out.println("Employee info: ");
        System.out.println(e.toString());
        System.out.println();


        Person.Employee.Faculty f = new Person.Employee.Faculty("Jon Dow", "Uppsala",
                "123456789", "t@t.se", new Date(2020, 7, 4), 25000.0,
                "8-17", "Professor");
        System.out.println("Faculty info: ");
        System.out.println(f.toString());
        System.out.println();


        Person.Employee.Staff sf= new Person.Employee.Staff("Jane Dow", "Kiruna",
                "123456789", "t@t.se", new Date(2020, 7, 4), 20000.0,
                "administrator");
        System.out.println("Staff info: ");
        System.out.println(sf.toString());

    }


}
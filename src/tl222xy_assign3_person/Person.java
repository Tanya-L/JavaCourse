/**
 * Date: 2020-07-04.
 * File Name: Person.java
 * Author: Tetiana Lytovchenko
 * Copyright (c): Tetiana Lytovchenko
 */

package tl222xy_assign3_person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Define a class named Person and its two subclasses named Student and Employee.
 * Define two other classes Faculty and Staff and make them subclasses of the Employee.
 * A person has a name, address, phone number, and email address.
 * A student has a class status (freshman, sophomore, junior, or senior).
 * An employee has a salary, and date hired.
 * A faculty member has office hours and a rank.
 * A staff member has a title.
 * Override the toString method in each class so that the method returns a String
 * that contains a person’s complete information.
 * For example, if we invoke toString method on an object of type Faculty,
 * it should return a String containing name, address, phone number, email address,
 * salary, date hired, office hours and rank information.
 */

public class Person {
    /**
     * Class Description: This class provides logic
     * for solving exercise.
     *
     * @version 1.0 04 July 2020
     * @author Tetiana Lytovchenko
     */

    private final String name;
    private final String address;
    private final String phone;
    private final String email;

    // create constructor with parameters
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + this.name + ", address: " + this.address + ", telephone number: "
                + this.phone + ", email address: " + this.email;
    }

    static class Student extends Person {

        public String FRESHMAN = "Freshman";
        public String SOPHOMORE = "Sophomore";
        public String JUNIOR = "Junior";
        public String SENIOR = "Senior";
        public String status;

        public Student(String name, String address, String phone, String email, String status) {
            super(name, address, phone, email);
            this.status = status;
        }

        public String toString() {
            return super.toString() + "\n" +
                    "class status: " + this.status;
        }
    }


    static class Employee extends Person {

        public Date dateHired;
        public double salary;

        public Employee(String name, String address, String phone, String email, Date dateHired, double salary) {
            super(name, address, phone, email);
            this.dateHired = dateHired;
            this.salary = salary;
        }

        public String toString() {
            String pattern = "yyy-MM-dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            String date = dateFormat.format(new Date());
            return super.toString() + "\n" + "date hired: " + date + " with salary equal " + this.salary + " kr";
        }

    }

    static class Faculty extends Employee {

        public String officeHours;
        public String rank;


        public Faculty(String name, String address, String phone, String email, Date date_hired, double salary, String officeHours, String rank) {
            super(name, address, phone, email, date_hired, salary);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        public String toString() {
            return super.toString() + "\n" + "office hour: " + this.officeHours + ", rank: " + this.rank;
        }
    }

    static class Staff extends Employee {

        public String title;

        public Staff(String name, String address, String phone, String email, Date dateHired, double salary,
                     String title) {
            super(name, address, phone, email, dateHired, salary);
            this.title = title;
        }

        public String toString() {
            return super.toString() + ", title: " + this.title;
        }
    }
}

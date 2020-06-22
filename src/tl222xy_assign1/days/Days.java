package tl222xy_assign1.days;
// Write a program Days.java that prompts user to enter two non-negative integer values:
//! The first value is for today’s day of the week and must be from 0 to 6, for today’s day of the
//week. The program should display an appropriate error message if the entered value is not
//from 0 to 6.
//! The second value is to compute the future day. The future day is computed by adding the
//second value to the first value.
//! The program should then determine and print today’s day of the week and the future day of
//the week based on codes as follows: Sunday is 0, Monday is 1, …, and Saturday is 6.

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //! The first value is for today’s day of the week and must be from 0 to 6, for today’s day of the
        //week. The program should display an appropriate error message if the entered value is not
        //from 0 to 6.
        System.out.print("Please, enter today's day (number between 0 to 6): ");
        int dayToday = s.nextInt();

        //! The second value is to compute the future day. The future day is computed by adding the
        //second value to the first value.
        System.out.print("Please, enter the number of the future days after today: ");
        int dayFuture = s.nextInt();
        int futureDayWeek = (dayToday + dayFuture) % 7;
        String dayWeek = "";

        // Get the name for the week day
        switch (dayToday) {
            case 0:
                dayWeek = "Sunday";
                break;
            case 1:
                dayWeek = "Monday";
                break;
            case 2:
                dayWeek = "Tuesday";
                break;
            case 3:
                dayWeek = "Wednesday";
                break;
            case 4:
                dayWeek = "Thursday";
                break;
            case 5:
                dayWeek = "Friday";
                break;
            case 6:
                dayWeek = "Saturday";
                break;
            default:
                dayWeek = "Invalid data";
                break;
        }
        //! The program should then determine and print today’s day of the week and the future day of
        // the week based on codes as follows: Sunday is 0, Monday is 1, …, and Saturday is 6.
        if (futureDayWeek == 0) {
            System.out.printf("Today is %s and the future day is Sunday", dayWeek);
        } else if (futureDayWeek == 1) {
            System.out.printf("Today is %s and the future day is Monday", dayWeek);
        } else if (futureDayWeek == 2) {
            System.out.printf("Today is %s and the future day is Tuesday", dayWeek);
        } else if (futureDayWeek == 3) {
            System.out.printf("Today is %s and the future day is Wednesday", dayWeek);
        } else if (futureDayWeek == 4) {
            System.out.printf("Today is %s and the future day is Thursday", dayWeek);
        } else if (futureDayWeek == 5) {
            System.out.printf("Today is %s and the future day is Friday", dayWeek);
        } else if (futureDayWeek == 6) {
            System.out.printf("Today is %s and the future day is Saturday", dayWeek);
        }
    }
}
/**
 * PizzaMain.java
 *
 * @author Tetiana Lytovchenko
 */

package tl222xy_assign2_pizza;
/**
 * Write class PizzaMain.java that defines a main method.
 * The main method asks a user to order a pizza and displays description of
 * the ordered pizza with bill to pay. While ordering a pizza, a user can choose
 * only one type of topping (cheese, pepperoni, or ham), however, the chosen
 * topping can be ordered in multiple amount, i.e., more than one toppings of same
 * type can be ordered. The Pizza class and its methods should be used to handle
 * the pizza order and print the order information.
 * Executing the PizzaMain.java shall result in following user interaction:
 * Sun Jun 23 17:26:55 CEST 2019 Welcome to the Café LNU!
 * Please enter size of your pizza [small, medium, or large]: LaRge
 * Please enter type of topping [cheese, pepperoni, ham]: pepperoni
 * Please enter number of toppings you want: 2
 * Thank you, “You ordered a Large pizza with 2 pepperoni toppings.
 * Your bill is 24.00 kr”. Enjoy the food!
 * Note: • Current Date and Time shall be displayed at top of the console output as shown above.
 * Your program must be able to handle pizza size and topping input in any letter case
 * (lower, UPPER or miXeD) as shown in the above execution sample.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class PizzaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // get current date and time and format them in Europe/Stockholm timezone
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd, HH:mm:ss z yyyy");
        format.setTimeZone(TimeZone.getTimeZone("Europe/Stockholm"));

        System.out.println(format.format(now));

        System.out.println("Welcome to the Cafe LNU!");

        System.out.print("Please, enter size of your pizza [small, medium, or large]: ");
        String pizzaSize = s.nextLine();

        System.out.print("Please, enter number of toppings you want: ");
        int numOrderedToppings = Integer.parseInt(s.nextLine());
        int cheeseToppings = 0;
        int pepperoniToppings = 0;
        int hamToppings = 0;

        while (true) {
            System.out.print("Please, enter type of topping [cheese, pepperoni, ham]: ");
            String topping = s.nextLine();

            if (topping.equalsIgnoreCase("cheese")) {
                cheeseToppings = numOrderedToppings;
                break;
            } else if (topping.equalsIgnoreCase("pepperoni")) {
                pepperoniToppings = numOrderedToppings;
                break;
            } else if (topping.equalsIgnoreCase("ham")) {
                hamToppings = numOrderedToppings;
                break;
            } else {
                System.out.println("Bad topping name, try again");
            }
        }
        Pizza pizza = new Pizza(pizzaSize, cheeseToppings, pepperoniToppings, hamToppings);

        System.out.println("Thank you, \"" + pizza.getDescription() + "\". Enjoy the food!");
    }
}

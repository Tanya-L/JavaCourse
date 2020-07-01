/**
 * Pizza.java
 *
 * @author Tetiana Lytovchenko
 */
package tl222xy_assign2_pizza;

/**
 * This class stores information about a single pizza and is required to contain the following:
 * • private instance variables to store
 * o size of a pizza (either small, medium, or large),
 * o number of cheese toppings,
 * o number of pepperoni toppings,
 * o number of ham toppings.
 * public methods to get and set all the instance variables.
 * a public method named calcCost( ) that returns cost of the pizza.
 * Pizza cost is determined as follows:
 * Small: 10 kr + 3 kr per topping
 * Medium: 15 kr + 2.5 kr per topping
 * Large: 20 kr + 2 kr per topping
 * A public method named getDescription() that returns a String containing the pizza size,
 * type and quantity of selected topping, and the pizza cost, for example as follows:
 * “You ordered a Large pizza with 2 pepperoni toppings. Your bill is 24.00 kr”.
 * Write another class PizzaMain.java that defines a main method.
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

public class Pizza {
    private String pizzaSize;
    private int cheeseTopping;
    private int pepperoniTopping;
    private int hamTopping;

    public Pizza(String pizzaSize, int cheeseTopping, int pepperoniTopping, int hamTopping) {
        this.pizzaSize = capitalize(pizzaSize);
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.hamTopping = hamTopping;
    }

    //  public methods to get and set all the instance variables
    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }

    //    a public method named calcCost( ) that returns cost of the pizza.
    //* Pizza cost is determined as follows:
    //*   Small: 10 kr + 3 kr per topping
    //*   Medium: 15 kr + 2.5 kr per topping
    //*   Large: 20 kr + 2 kr per topping
    public double calcCost() {
        if (pizzaSize.equalsIgnoreCase("Small")) {
            return 10 + (cheeseTopping + pepperoniTopping + hamTopping) * 3;
        } else if (pizzaSize.equalsIgnoreCase("Medium")) {
            return 15 + (cheeseTopping + pepperoniTopping + hamTopping) * 2.5;
        } else if (pizzaSize.equalsIgnoreCase("Large")) {
            return 20 + (cheeseTopping + pepperoniTopping + hamTopping) * 2;
        } else {
            return 0;
        }
    }


    //    A public method named getDescription() that returns a String containing the pizza size,
    //* type and quantity of selected topping, and the pizza cost, for example as follows:
    //* “You ordered a Large pizza with 2 pepperoni toppings. Your bill is 24.00 kr”.
    String getDescription() {
        String s = "You ordered a " + pizzaSize + " pizza with ";
        if (cheeseTopping > 0) {
            s += cheeseTopping + " cheese toppings";
        } else if (pepperoniTopping > 0) {
            s += pepperoniTopping + " pepperoni toppings";
        } else if (hamTopping > 0) {
            s += hamTopping + " ham toppings";
        }
        s += ". Your bill is " + calcCost() + " kr";
        return s;
    }

    //    capitalize output
    public static String capitalize(String s) {
        if (s.length() == 0) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

}

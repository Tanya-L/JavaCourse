package tl222xy_assign1.print;
// Write a program Print.java that prints the phrase Write once, run everywhere!

public class Print {

    public static void main(String[] args) {
        //! on one line,
        System.out.println("Write once, run everywhere!");

        //! on four lines, one word on each line,
        System.out.println("Write" + '\n' + "once," + '\n' + "run" + '\n' + "everywhere!");

        //! inside a rectangle made up by the characters *
        System.out.println("*******************************");
        System.out.println("* Write once, run everywhere! *");
        System.out.println("*******************************");

    }
}
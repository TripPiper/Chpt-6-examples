
package chapter6classesandobjects;

import java.util.Scanner;

/**
 *
 * @author Tutor
 */
public class Chapter6ClassesandObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates a Rectangle object and assign its
        // address to the box variable.
        Rectangle box = new Rectangle(15, 63);
        Scanner input = new Scanner(System.in);
        // Indicates what we are doing.
        //System.out.println("Sending the value 10.0 "
        //  + "to the setLength method");
        // Calls the box object setLength
        // box.setLength(10.0);

        System.out.println("What is the length of the box? ");
        double length1 = input.nextDouble();
        // Calls the box object setLength and set to user's input
        box.setLength(length1);
        // Calls the box objects setWidth to user's input and setWidth to user's input.
        //box.setWidth(20.0);
        System.out.println("What is the width of the box? ");
        double width1 = input.nextDouble();
        box.setWidth(width1);

        // Display the object's setWidth method and setLength method
        System.out.println(" The box's length is "
                + box.getLength());
        System.out.println(" The box's width is "
                + box.getWidth());

        System.out.println(" The box's area is "
                + box.getArea());

        // Indicates what we are done
        System.out.println("Done.");

    }

}

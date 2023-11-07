package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 * Created by Sandip Patel
 */

public class Programme_4_ColoursArray {
    // Declare main method
    public static void main(String[] args) {
        coloursArray();
    }

    public static void coloursArray() {

        // Create a new ArrayList to stores colours
        ArrayList<String> colours = new ArrayList<>(); //<> not necessary
        // Add colours to the ArrayList
        colours.add("Blue");
        colours.add("Red");
        colours.add("Black");
        colours.add("White");
        colours.add("Green");

        // Use for each loop to print out the colours
        System.out.println("Colours in the ArrayList");
        for (
                String colour : colours) {
            System.out.println(colour);

        }
    }
}



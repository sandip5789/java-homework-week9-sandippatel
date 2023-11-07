package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not
 * Created by Sandip Patel
 */

public class Programme_7_ArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        arrayListIsEmptyOrNot();

    }
    public static void arrayListIsEmptyOrNot(){
        ArrayList<String> arrayList = new ArrayList(); // <> not required

        // Check if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        // Now Add some elements to the ArrayList
        arrayList.add("Colour 1");
        arrayList.add("Colour 2");

        // Check again if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");

        }
    }
}

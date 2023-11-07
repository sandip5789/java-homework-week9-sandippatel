package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 * Created by Sandip Patel
 */

public class Programme_6_RetrieveAnElements {
    public static void main(String[] args) {
        retrieveAnElements();
    }
    public static void retrieveAnElements() {
        // Create ArrayList of integers
        java.util.ArrayList<String> arrayList = new ArrayList<>(); // <> not necessary

        // Add some elements to the ArrayList
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("White");

        // Specify the index of the element you want to retrieve
        int indexToRetrieve = 2; // retrieve elements index 2 which is Red as index start from 0

        // Check if the index is within the valid range with if else statement
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Elements at index " + indexToRetrieve + " : " + element);
        } else {
            System.out.println("Index is out of range");

        }
    }
}
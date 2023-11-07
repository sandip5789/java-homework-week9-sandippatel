package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator
 * Created by Sandip Patel
 */

public class Programme_5_ElementsInArray {

    public static void main(String[] args) {
        elementsInArray();
    }
    public static void elementsInArray() {
        // Create ArrayList and add elements
        ArrayList<String> arrayList = new ArrayList<>(); //<> not necessary
        arrayList.add("Colour 1");
        arrayList.add("Colour 2");
        arrayList.add("Colour 3");
        arrayList.add("Colour 4");
        arrayList.add("Colour 5");

        // Create Iterator to iterate through the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        // Use a while loop to iterate through the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
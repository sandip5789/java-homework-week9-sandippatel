package homeworkweek9;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 * Created by Sandip Patel
 */

public class Programme_8_HashSet {
    public static void main(String[] args) {
        hashSet();
    }
    public static void hashSet() {
        // Create HashSet to store values
        HashSet<Integer> numberSet = new HashSet(); // <Integer> not required

        // Adding numbers 4, 7, and 8 to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers between 1 and 10 in the set : ");

        // Check which numbers from 1 to 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}




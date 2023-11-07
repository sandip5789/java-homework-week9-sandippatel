package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 * Created by Sandip Patel
 */

public class Programme_9_HashMap {
    public static void main(String[] args) {
        hashMap();
    }
    public static void hashMap(){
        // Create HashMap to store String keys and Integer values
        Map<String, Integer> people = new HashMap();

        // Add some key value pairs to the HashMap
        people.put("Virat", 100);
        people.put("Sachin", 90);
        people.put("Rohit", 80);
        people.put("Surya", 70);

        // Iterate through the values in the HashMap using for each loop
        for (Map.Entry<String, Integer> runs : people.entrySet()) {
            System.out.println(runs.getKey() + " " + runs.getValue());

//       Iterator<Map.Entry<String, Integer>> peopleList = people.entrySet().iterator();
//        while (peopleList.hasNext()){
//            System.out.println(peopleList.next());
//        }
        }
    }
}

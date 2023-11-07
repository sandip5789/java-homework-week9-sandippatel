package homeworkweek9;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 * Created by Sandip Patel
 */

public class Programme_11_TwoArrayListAndCompare {
    public static void main(String[] args) {
        twoArrayListAndCompare();
    }
    public static void twoArrayListAndCompare(){
        // Declare arrayList c1
        ArrayList<String> c1 = new ArrayList();
        c1.add ("Red");
        c1.add ("Green");
        c1.add ("Black");
        c1.add ("White");
        c1.add ("Pink");

        // Declare arrayList c2
        ArrayList<String> c2 = new ArrayList();
        c2.add ("Red");
        c2.add ("Green");
        c2.add ("Black");
        c2.add ("Pink");

        // Compare the ArrayLists
        if(c1.equals(c2)) {
           System.out.println("c1 and c2 are equal.");
        } else {
           System.out.println("c1 and c2 are not equal.");
        }
    }
}

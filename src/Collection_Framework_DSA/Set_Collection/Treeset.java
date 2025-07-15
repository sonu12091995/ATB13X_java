package Collection_Framework_DSA.Set_Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
       // ts.add(123);// Not allowed different datatype become on sorting same data type
        // ts.add(null);


        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }


        System.out.println("-------------------Iterator__");
        Iterator iterator = ts.iterator(); // ✅ for type safety
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

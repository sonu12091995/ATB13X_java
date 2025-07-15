package Collection_Framework_DSA.Set_Collection;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set lhs = new java.util.LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        // Function are same

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        // For-each loop
        for (Object s : lhs) {
            System.out.println(s);
        }


        // Iterator loop

        System.out.println("-------------------Iterator__");
        Iterator iterator = lhs.iterator(); // ✅ for type safety
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

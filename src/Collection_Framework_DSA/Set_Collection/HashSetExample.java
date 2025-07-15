import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon"); // duplicate, won't be added
        hs.add(null);         // null allowed once
        hs.add(null);

        System.out.println(hs);  // Print HashSet

        System.out.println(hs.isEmpty());           // false
        System.out.println(hs.contains("Apple"));   // true
        System.out.println(hs.size());              // number of unique elements

        // For-each loop
        for (String s : hs) {
            System.out.println(s);
        }

        System.out.println(" ---------------------------");

        // Iterator loop
        Iterator<String> iterator = hs.iterator(); // ✅ Add <String> for type safety
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ---------------------------");
    }
}
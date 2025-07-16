package Collection_Framework_DSA.Map_collection.TreeMap_;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Claas {
    public static void main(String[] args) {

        // Order will mainmaint
        Map m2 = new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);



        // Check if key "phone" exists
        System.out.println("Contains key 'phone'? " + m2.containsKey("phone"));

        // Get value by key
        System.out.println("Value for key 'rill': " + m2.get("rill"));

        // Remove a key-value pair
        m2.remove("name");

        // Get all entries in the map
        System.out.println("Entry Set: " + m2.entrySet());

        // Get all values (this does NOT take a key/parameter)
        System.out.println("All values: " + m2.values());

        // Add null key and value
        m2.put(null, null); // Only one null key allowed, will overwrite if added again

        System.out.println("Final Map: " + m2);


    }
}

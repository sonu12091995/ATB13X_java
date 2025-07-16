package Collection_Framework_DSA.Map_collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HasMap_genreic {
    public static void main(String[] args) {

       // Map m = new Map(); interface not create object
         // Not maintain the order
        Map m = new HashMap<>();

        // Add key-value pairs
        m.put("name", "sonu");
        m.put("rill", 125678889);
        m.put("phone", 234);

        // Print the entire map
        System.out.println("Map content: " + m);

        // Check if key "phone" exists
        System.out.println("Contains key 'phone'? " + m.containsKey("phone"));

        // Get value by key
        System.out.println("Value for key 'rill': " + m.get("rill"));

        // Remove a key-value pair
        m.remove("name");

        // Get all entries in the map
        System.out.println("Entry Set: " + m.entrySet());

        // Get all values (this does NOT take a key/parameter)
        System.out.println("All values: " + m.values());

        // Add null key and value
        m.put(null, null); // Only one null key allowed, will overwrite if added again

        System.out.println("Final Map: " + m);
    }

    }


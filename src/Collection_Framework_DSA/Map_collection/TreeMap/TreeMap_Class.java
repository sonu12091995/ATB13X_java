package Collection_Framework_DSA.Map_collection.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Class {
    public static void main(String[] args) {

        Map m3 = new TreeMap();
        m3.put("rollno", 1);
        m3.put("phone", 987654321);
        System.out.println(m3);


        // Check if key "phone" exists
        System.out.println("Contains key 'phone'? " + m3.containsKey("phone"));

        // Get value by key
        System.out.println("Value for key 'rill': " + m3.get("rill"));

        // Remove a key-value pair
        m3.remove("name");

        // Get all entries in the map
        System.out.println("Entry Set: " + m3.entrySet());

        // Get all values (this does NOT take a key/parameter)
        System.out.println("All values: " + m3.values());

        // Add null key and value
        //m3.put(null, null); // Null pointer exception

        System.out.println("Final Map: " + m3);


}}

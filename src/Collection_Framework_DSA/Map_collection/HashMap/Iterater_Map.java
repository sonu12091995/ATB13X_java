package Collection_Framework_DSA.Map_collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Iterater_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        System.out.println(map.size());

        // Fist Method
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());

            // second method

            for (String key : map.keySet()) {
                System.out.println(key + " --->" + map.get(key));
            }
        }
    }
}


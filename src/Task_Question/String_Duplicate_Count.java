package Task_Question;

import java.util.HashMap;
import java.util.Map;

public class String_Duplicate_Count {
    public static void main(String[] args) {

        String input = "Programe";
        input = input.toLowerCase();

        Map<Character,Integer> count = new HashMap<>();

        // Count character frequencies
        for (char c : input.toCharArray()) {
            if (c != ' ') { // skip spaces, but not required for "Programe"
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }

        // Print only duplicates
        for (Map.Entry<Character,Integer> item : count.entrySet()) {
            if (item.getValue() > 1) {
                System.out.println(item.getKey() + " = " + item.getValue());
            }
        }
    }
}

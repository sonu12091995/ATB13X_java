package Collection_Framework_DSA;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters
{
    public static void main(String[] args) {
        String str = "programming";

        // Convert to lowercase to avoid case sensitivity (optional)
        str = str.toLowerCase();

        // Use HashMap to store character counts frquancy
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Ignore spaces
            if (c == ' ') continue;

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        //System.out.println("Duplicate characters in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

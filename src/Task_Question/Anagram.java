package Task_Question;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";



        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Count frequency of characters in s2
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare both maps
        if (map1.equals(map2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}



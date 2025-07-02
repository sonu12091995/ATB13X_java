package Array_1_D;

import java.util.LinkedHashSet;

public class Remove_duplicate_character {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        // LinkedHashSet maintains insertion order
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Add characters to set
        for (char ch : input.toCharArray()) {
            set.add(ch);
        }

        // Build result string
        for (char ch : set) {
            result += ch;
        }

        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

}

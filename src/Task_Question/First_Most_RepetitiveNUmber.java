package Task_Question;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Most_RepetitiveNUmber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 4, 7, 2, 2};

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find the number with max frequency
        int maxCount = 0;
        int mostRepeated = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeated = entry.getKey();
            }
        }

        System.out.println("Most repetitive number: " + mostRepeated + " (count = " + maxCount + ")");
    }
    }


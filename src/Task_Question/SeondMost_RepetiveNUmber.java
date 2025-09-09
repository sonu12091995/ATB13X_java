package Task_Question;

import java.util.LinkedHashMap;
import java.util.Map;

public class SeondMost_RepetiveNUmber {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 4, 8, 2, 4, 7, 2, 2};

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Track first and second most frequent
        int firstMax = 0, secondMax = 0;
        int firstNum = -1, secondNum = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();

            if (count > firstMax) {
                secondMax = firstMax;
                secondNum = firstNum;

                firstMax = count;
                firstNum = entry.getKey();
            } else if (count > secondMax && count < firstMax) {
                secondMax = count;
                secondNum = entry.getKey();
            }
        }
        System.out.println("Number count " + secondMax +"Second most repetive number " +secondNum );

    }
    }


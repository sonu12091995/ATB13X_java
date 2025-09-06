package Task_Question;

import java.util.HashMap;
import java.util.Map;

public class Freuancy {
    public static void main(String[] args) {

        String input = "Programme";
        input = input.toLowerCase();

        Map<Character,Integer> freq = new HashMap<>();

        for (char c : input.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }
}

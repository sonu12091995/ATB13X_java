package Task_Question;

import java.util.HashMap;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (char c2 : s2.toCharArray()){
            map2.put(c2,map2.getOrDefault(c2,0)+1);
        }

        if (map1.equals(map2)){
            System.out.println("Anagram");
        }else{
            System.out.println(" not anagram");
        }
    }
}

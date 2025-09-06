package Task_Question;

import java.util.LinkedHashSet;

public class Remove_Duplicate_IString {
    public static void main(String[] args) {
        String input = "progtsmmmtweww";
        String result= " ";


        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()){
            set.add(c);
        }
        for (char c : set){
            result += c;
        }
        System.out.println(input);
        System.out.println(result);
    }
}

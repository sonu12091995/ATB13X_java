package Task_Question;

import javax.swing.*;
import java.util.LinkedHashSet;

public class Remove_Duplicate_Integer {

    public static void main(String[] args) {

        int [] arr = {2,3,4,4,5,5,6};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr){
            set.add(num);
        }

        for (int num : set){
            System.out.println(num);
        }

    }



}

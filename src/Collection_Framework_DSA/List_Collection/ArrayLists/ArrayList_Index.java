package Collection_Framework_DSA.List_Collection.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Index {
    public static void main(String[] args) {
        List list = new ArrayList();
        //List list = new ArrayList(10);
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        list.add(4);  //4
        list.add(true);  //5
        list.add("3"); // 6


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));//true
        System.out.println(list.contains(1));//false

        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("1"));
        System.out.println(list.lastIndexOf("3"));
    }
}

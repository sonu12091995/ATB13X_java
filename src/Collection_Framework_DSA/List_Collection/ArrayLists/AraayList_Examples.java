package Collection_Framework_DSA.List_Collection.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class AraayList_Examples {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());// false

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty()); //Ture

    }
}

package Collection_Framework_DSA.List_Collection.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AraayList_Examples {
    public static void main(String[] args) {
        // Using generics and ArrayList
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed
        arrayList.add(123);     // Different data type is allowed (Object type)

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Size: " + arrayList.size());

        System.out.println("Index of 'pramod': " + arrayList.indexOf("pramod"));
        System.out.println("Last index of null: " + arrayList.lastIndexOf(null));

        // Manually get first and last elements (getFirst/getLast don't exist in ArrayList)
        System.out.println("First Element: " + arrayList.get(0));
        System.out.println("Last Element: " + arrayList.get(arrayList.size() - 1));

        // Iterator
        System.out.println("\nUsing Iterator:");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Enhanced for loop
        System.out.println("\nUsing Enhanced For Loop:");
        for (Object item : arrayList) {
            System.out.println(item);
        }

        // Traditional for loop
        System.out.println("\nUsing Traditional For Loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

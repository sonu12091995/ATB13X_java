package Collection_Framework_DSA.List_Collection.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList_DynamicDispatch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("pramod");
        list.add(null);
        list.add("dutta");
        list.add("dutta"); // Duplicate is allowed.
        list.add(123); // Different data type is allowed.

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.indexOf("pramod"));// 0 index
        System.out.println(list.lastIndexOf(null));// 1
        System.out.println(list.getFirst()); // first value
        System.out.println(list.getLast()); // last value

        // Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------Dynamic Dispatch------");

        List l = new LinkedList(); // Dynamic Dispatch using List interface
        //l.addFirst("first");
        l.add("123");
        l.add("456");
        ((LinkedList) l).addLast("Last");

        System.out.println(l.contains("123"));
        System.out.println(l.indexOf("123"));
        System.out.println(l.lastIndexOf("456"));
        System.out.println(((LinkedList) l).getFirst());
        System.out.println(((LinkedList) l).getLast());

        // Iterator
        Iterator iterator1 = l.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}

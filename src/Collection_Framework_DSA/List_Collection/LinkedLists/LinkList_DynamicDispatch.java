package Collection_Framework_DSA.List_Collection.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkList_DynamicDispatch {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Sonu"); // 0 index
        list.add("sharma");// i index
        list.add(12);// 2 index
        list.set(2,"monu"); // 12(index no= 2) convert to menu
        list.add(12);// duplicate
        list.add(null); // null are allowed
        System.out.println(list.size());

        System.out.println(list);
    }
}

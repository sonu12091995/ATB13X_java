package Collection_Framework_DSA.List_Collection.Vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
//
public class iterator_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator  = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){// Move for previous
            System.out.println(listIterator.previous());
        }


        System.out.println(" --- ");

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}

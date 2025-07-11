package Collection_Framework_DSA.List_Collection.Vector;

import Array_2__D.Itrate_Array;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
         Vector v = new Vector();
        Vector v1 = new Vector(10);



        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);


        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }


        System.out.println(" ----  For  Each Loop ");

        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

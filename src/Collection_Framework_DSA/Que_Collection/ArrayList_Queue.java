package Collection_Framework_DSA.Que_Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayList_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}

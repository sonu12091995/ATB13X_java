package Collection_Framework_DSA.List_Collection.LinkedLists;

import java.util.LinkedList;

public class String_linkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");// add first
        animals.addLast("Elephant");// on the add last
        animals.addLast("Elephant");// add duplicate last
        System.out.println("LinkedList: " + animals);

       // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());
    }
}

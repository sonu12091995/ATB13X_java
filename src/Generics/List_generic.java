package Generics;

import java.util.ArrayList;
import java.util.List;

public class List_generic {
    public static void main(String[] args) {

        //Generic list  add any data value
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Pramod");
        normalList.add(true);



  // only add the Integer data
        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Pramod"); // Not allowed
    }

}

package Collection_Framework_DSA.List_Collection.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class inteview_sort_Collection {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);



    }
}

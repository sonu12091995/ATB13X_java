package Collection_Framework_DSA.Map_collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _ArrayList_Store_map {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone",9876543210l);
        student1.put("address1","Bangalore");
        student1.put("address2",560021);

        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lukcy");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}

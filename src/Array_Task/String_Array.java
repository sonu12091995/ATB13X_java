package Array_Task;

import java.io.OutputStream;

public class String_Array {
    public static void main(String[] args) {

        String[] names = {"Sonu", "Monu", "Pooja"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Second way fixed size
        String[] a=  new String[3];
        a[0] = "Sonu";
        a[1] = "MONU";
        a[2] = "rEKHA";
        System.out.println(a[0]);

    }
}

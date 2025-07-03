package Array_1_D;

public class String_Array {
    public static void main(String[] args) {

        String[] names = {"Sonu", "Monu", "Pooja"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        //   for(int i = 0; i<name.length; i++)
        //        {
        //         System.out.println(name[i]);
        //
        //        }

        // Second way fixed size
        String[] a=  new String[3];
        a[0] = "Sonu";
        a[1] = "MONU";
        a[2] = "rEKHA";
        System.out.println(a[0]);

    }
}

package Oprators;

public class Advanced_increament {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + a);//21




        int c= 10;
        System.out.println(c++ + ++c);//22
        System.out.println(c);//12



        int d = 10;
        System.out.println(++d + ++d);//23
        System.out.println(d);//12

// interview question
        int e = 5;

        int f = a++;

        System.out.println("e: " + e + ", f: " + f);



// Program 2:
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // ?

        //Program 3:

        int x = 5;

        System.out.println(x++ + ++x); // ?





//Program 4:

        int z = 5;

        System.out.println(++z); // Output: ?

        System.out.println(z++); // Output: ?

        System.out.println(z);   // Output: ?



        int k = 5;

        int l = a++ + ++a;

        System.out.println("k: " + k); // Output: ?

        System.out.println("l: " +l); // Output: ?


    }
}

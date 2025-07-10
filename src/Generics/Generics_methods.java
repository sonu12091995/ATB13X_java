package Generics;

public class Generics_methods {
    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("pramod","dutta");

    }




    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}

package Generics;

public class Generic_Retruen {
    public static void main(String[] args) {
        display(3,4,"45");

        display("pramod","dutta","56");

    }

    static <T> T display(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;
    }
}

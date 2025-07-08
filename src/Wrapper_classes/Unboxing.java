package Wrapper_classes;

public class Unboxing {
    public static void main(String[] args) {

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
}

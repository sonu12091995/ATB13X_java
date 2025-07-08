package Wrapper_classes;

public class Boxing {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); // Behav
        System.out.println(Integer.MIN_VALUE); // Behav
    }
}

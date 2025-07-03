package oops_polymorphism.Overloading;
class MathOperations {
    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}
public class Overriding_MathOpration {
    public static void main(String[] args) {
        MathOperations math  = new MathOperations();
        int a = math.add(12,33);// firt method run
        System.out.println(a);

        int r2  = math.add(3,4,6);// Second method run
        System.out.println(r2);

        double r3  = math.add(3.14,4.56);
        System.out.println(r3);// 3rd method run
    }

}


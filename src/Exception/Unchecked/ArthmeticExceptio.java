package Exception.Unchecked;

public class ArthmeticExceptio {

    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0; // java.lang.ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Div by Zero not allowed!");
        }
        System.out.println(a);
    }
}

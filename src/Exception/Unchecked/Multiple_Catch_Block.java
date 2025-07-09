package Exception.Unchecked;

public class Multiple_Catch_Block {
    public static void main(String[] args) {
        int a = 0;

        try {
            a = 10 / 0; // This will throw ArithmeticException
        }

        catch (ArithmeticException e) {
            System.out.println("️ Division by zero is not allowed!");
        } catch (Exception e) {
            System.out.println(" Some other exception occurred: " + e.getMessage());
        }

        System.out.println("Value of a: " + a);
    }
    }


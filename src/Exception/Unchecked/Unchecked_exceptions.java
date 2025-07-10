package Exception.Unchecked;

public class Unchecked_exceptions {
    public static void main(String[] args) {
        /*System.out.println("Starting the program!");
        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); // java.lang.NumberFormatException
        Integer output = 100/a; // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program!");*/

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

        // Handle

        try {
            String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }


    }
}

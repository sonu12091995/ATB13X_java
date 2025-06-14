package UserInput;

import java.util.Scanner;

public class Scanner_String_double {
    public static void main(String[] args) {


        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.next();
        System.out.println(s);



        System.out.println("Enter the double");
        Double d =  scanner.nextDouble();
        System.out.println(d);


        System.out.println("Enter the Float");
        Float f =  scanner.nextFloat();
        System.out.println(f);




    }
}

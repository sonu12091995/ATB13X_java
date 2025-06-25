package Task_Question;

import java.util.Scanner;

public class Reverse_String_palidrom_dynamiclly {

    static String reverse(String userInput){
        // Dynamic create with help of mwthods

        String rev = " ";
        for (int i = userInput.length()-1; i>=0 ; i--) {
         rev = rev+userInput.charAt(i);
        }
        return userInput;
    }



    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter the String");
        String input  = SC.next();

        // Calling method(reverse)
        String reverse_string = reverse(input);

        if (reverse_string.equalsIgnoreCase(input))
        {
            System.out.println("This is the palidrom");
        }else {
            System.out.println("Not Palidrom");
        }

    }
}

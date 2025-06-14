package UserInput;

import java.util.Scanner;

public class Scanner_Inputs_int {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the age");// Here pass the String(son) on the console getting the InputMismatchException

        int age = scanner.nextInt();
        String canVote = (age>=18)? "vote" : "Not vote";
        System.out.println(canVote);


    }
}

package Task_Question;

import java.util.Scanner;

public class Maximum_number {
    public static void main(String[] args) {

        //Find the Maximum of Two Numbers.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the A enter");
        int a = scanner.nextInt();

        System.out.println("Enter the B enter");
        int b = scanner.nextInt();

        String number = a>b? "A Maximum" : " B Maxium";
        System.out.println(number);
    }
}

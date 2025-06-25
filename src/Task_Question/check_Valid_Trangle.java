package Task_Question;

import java.util.Scanner;

public class check_Valid_Trangle {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enther the A trangle value");
        int a =scanner.nextInt();

        System.out.println("Enther the b trangle value");
        int b =scanner.nextInt();

        System.out.println("Enther the c trangle value");
        int c =scanner.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("This is the trangle");

        }else{
            System.out.println("Invalid Trangle");

        }
    }
}

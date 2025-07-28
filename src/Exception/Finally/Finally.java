package Exception.Finally;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the v");
        int v = sc.nextInt();


        try {
            int b = 10 / v;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class demoPurpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the num value");
        int num = sc.nextInt();

        try {
            int b = 100 / num;
            System.out.println(b);
        }catch (ArithmeticException e) {
            System.out.println(e .getMessage());
        }finally{
            sc.close();
            System.out.println(" Finllybloc close");
        }

    }
}



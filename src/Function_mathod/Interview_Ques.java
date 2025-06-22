package Function_mathod;


import javax.swing.*;
import java.util.Scanner;

public class Interview_Ques {
    /*Create a function of sum,sub,mul,dic
     * create a para (a,b) and return type
     * a,b int scanner
     * also fic=xed edge case
     * */

    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a/ b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter the value a");
        int a =scanner.nextInt();

        System.out.println("Enter the value b");
        int b =scanner.nextInt();*/



        //Handle the String error numberFormatException
         System.out.println("Enter the value a");
        int a =0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the int value");
            return;
        }

        System.out.println("Enter the value b");
        int  b=0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }else {
            System.out.println("Enter the int value");
            return;
        }



        //calling the all functions
        int result_sum = sum(a,b);
        System.out.println(result_sum);

        int result_sub = sub(a,b);
        System.out.println(result_sub);

        int result_mul = mul(a,b);
        System.out.println(result_mul);

        int result_div = div(a,b);
        System.out.println(result_div);
    }
}

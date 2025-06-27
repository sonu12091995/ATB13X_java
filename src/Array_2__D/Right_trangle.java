package Array_2__D;

import java.util.Scanner;

public class Right_trangle {
    public static void main(String[] args) {


        //With scanner
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();

        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }





       //Without scanner
        int star=5;
        for (int i =1; i<=star; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

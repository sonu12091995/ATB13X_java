package Array_2__D;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then table size");
        int Table_size = sc.nextInt();
        for (int i = 1; i <= Table_size; i++) {

            for (int j = 1; j <= Table_size; j++) {
                System.out.print(i*j + "  |  ");
            }
            System.out.println();
        }


        // Second type without scanner

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + "  |  ");
            }
            System.out.println();
        }
    }
}

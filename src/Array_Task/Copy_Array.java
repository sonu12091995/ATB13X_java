package Array_Task;

import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        int test1 [] = new int[3];
        test1[0] = 30;
        test1[1] = 40;
        test1[2] = 50;

        System.out.println(Arrays.toString(test1)); //[30, 40, 50]

        int test2[] = new int[3];
        for (int i= 0; i<3; i++){
            test2[i] = test1[i];
        }

        System.out.println("Copy the array second string "+ Arrays.toString(test2));
    }
}

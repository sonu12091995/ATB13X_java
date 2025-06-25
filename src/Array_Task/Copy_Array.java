package Array_Task;

import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        int test1 [] = {13,40,50};

        System.out.println(Arrays.toString(test1)); //[30, 40, 50]

        int test2[] = new int[3];
        for (int i= 0; i<3; i++){
            test2[i] = test1[i];
        }

        System.out.println("Copy the array second string "+ Arrays.toString(test2));


        // Second way user define method
        int[] original = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] copy = new int[original.length];

        // Copying array elements
        System.arraycopy(original, 0, copy, 0, original.length);

        // Printing the copied array
        System.out.println("Copied Array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}

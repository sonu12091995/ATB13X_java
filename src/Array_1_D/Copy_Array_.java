package Array_1_D;

import java.util.Arrays;

public class Copy_Array_ {
    public static void main(String[] args) {
      //  https://www.programiz.com/online-compiler/0HdHsbsiNLWdN
        int [] orignal = {13,40,50};

        System.out.println(Arrays.toString(orignal)); //[30, 40, 50]

        int copy[] = new int[3];
        for (int i= 0; i<3; i++){
            copy[i] = orignal[i];
        }
        System.out.println("Copy the array second string "+ Arrays.toString(copy));






        // Second way user define method
        int[] original1 = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] copy1 = new int[original1.length];

        // Copying array elements
        System.arraycopy(original1, 0, copy, 0, original1.length);

        // Printing the copied array
        System.out.println("Copied Array:");
        for (int i = 0; i < copy1.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}

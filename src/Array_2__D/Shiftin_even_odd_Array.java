package Array_2__D;

import java.util.Arrays;

public class Shiftin_even_odd_Array {
    public static void main(String[] args) {
//https://www.programiz.com/online-compiler/9qbqamdnG5bv8
        int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9,0};
        int[] result = new int[arr.length];

        int left = 0;                      // start for even numbers
        int right = arr.length - 1;        // end for odd numbers

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[left++] = arr[i];   // place even at the left
            } else {
                result[right--] = arr[i];  // place odd at the right
            }
        }

        // Output the result
        System.out.println("Rearranged array (Even left, Odd right):");
        System.out.println(Arrays.toString(result));//[2, 8, 6, 4, 0, 9, 5, 3, 1, 7, 5]
    }
}

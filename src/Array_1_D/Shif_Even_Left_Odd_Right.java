package Array_1_D;

import java.util.Arrays;

public class Shif_Even_Left_Odd_Right {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
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
        System.out.println(Arrays.toString(result));
    }
}

package Array_1_D;

import java.util.LinkedHashSet;

public class remove_duplicate_Array {
    public static void main(String[] args) {
        int[] arr = {7, 2, 55, 3, 2, 1, 9};

        // LinkedHashSet maintains insertion order and removes duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }}

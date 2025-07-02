package Array_1_D;

public class Duplicate_Array_find {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4, 5, 2};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;  // Prevent printing the same duplicate again
                }
            }
        }
    }
}

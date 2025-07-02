package Array_1_D;

public class Sort_Array_Without_Sort_Function {
    public static void main(String[] args) {

        int[] arr = {7, 2, 5,5,2,11, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swap values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

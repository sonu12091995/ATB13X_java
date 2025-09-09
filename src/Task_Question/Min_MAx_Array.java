package Task_Question;

public class Min_MAx_Array {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // update min
            }
            if (arr[i] > max) {
                max = arr[i];  // update max
            }
        }

        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
    }
    }


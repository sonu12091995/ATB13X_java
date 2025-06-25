package Array_Task;

public class Avrage_Array {
    public static void main(String[] args) {
        int[] num = {23, 33, 45};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        // Correct: print sum
        System.out.println("Sum: " + sum);

        // Calculate and print average
        int avg = sum / num.length;
        System.out.println("Average: " + avg);
    }
}

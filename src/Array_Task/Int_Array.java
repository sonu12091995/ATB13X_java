package Array_Task;

public class Int_Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Fixed way

        int a [] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}

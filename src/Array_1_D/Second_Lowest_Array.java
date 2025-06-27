package Array_1_D;

public class Second_Lowest_Array {
    public static void main(String[] args) {
        int[] num = {20, 30, 40, 50, 60};
        //https://www.programiz.com/online-compiler/0I9I3RCI9bwja
        int lowest = num[0];
        int secondLowest = Integer.MAX_VALUE;

        // Step 1: Find the lowest number
        for (int i = 1; i < num.length; i++) {
            if (num[i] < lowest) {
                lowest = num[i];  // 20
            }
        }

        // Step 2: Find the second lowest number
        for (int i = 0; i < num.length; i++) {
            if (num[i] < secondLowest && num[i] > lowest) {
                secondLowest = num[i]; // 30
            }
        }

        System.out.println("This is the second lowest number: " + secondLowest);
    }
}

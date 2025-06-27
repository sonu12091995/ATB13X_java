package Array_1_D;

import java.util.Arrays;
//https://www.programiz.com/online-compiler/8G4Gl76fINXkU
public class sort_Array {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 40, 50};
        Arrays.sort(numbers);

        for (int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);//
        }

    }
}

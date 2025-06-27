package Array_1_D;

public class Max_Min_Array_Interview_with_Method {


    static int give_me_max(int[] array){
        int max = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    static int give_me_min(int[] array){
        int min = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9
        //  CALL THE BOTH METHOD
        int maxOutput =   give_me_max(array);
        int minOutput  = give_me_min(array);
        //Print the both array
        System.out.println(maxOutput);
        System.out.println(minOutput);

    }


}

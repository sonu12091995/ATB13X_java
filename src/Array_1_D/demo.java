package Array_1_D;

public class demo {


    // Max Array
    static int give_Me_max(int[] array){
        int max = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    // Min Array

    static  int give_Me_min(int [] array){
        int min = array[0];
        for(int i = 0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }


    public static void main(String[] args) {
        int  []  array= {23,45,77,34,14,66,44};
 //  CALL THE BOTH METHOD
      int maxOutput =   give_Me_max(array);
      int minOutput  = give_Me_min(array);
      //Print the both array
        System.out.println(maxOutput);
        System.out.println(minOutput);
    }
}

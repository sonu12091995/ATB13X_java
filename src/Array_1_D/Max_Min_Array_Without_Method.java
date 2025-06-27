package Array_1_D;

public class Max_Min_Array_Without_Method {
    public static void main(String[] args) {
       // https://www.programiz.com/java-programming/online-compiler/
        int array [] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        // logic
        for (int i= 0; i<array.length; i++)
        {
            if (array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println(" This is the Maximum array"  +max);



        // Minimum Array    https://www.programiz.com/online-compiler/0939vR8cDiZsY

        int array1 [] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int min = array1[0];
        for (int i = 0; i<array1.length; i++)
        {
            if (array1[i]<min)
            {
                min = array1[i];
            }
        }

        System.out.println(" This is the Minimum Array " +min);


    }
}

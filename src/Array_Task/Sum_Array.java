package Array_Task;

public class Sum_Array {
    public static void main(String[] args) {

        int num []  = {23,33,45};
        int sum = 0;
        for (int i= 0; i<num.length; i++)
        {
            sum = sum+num[i];
        }
        System.out.println(num);

        int avg = sum/3;
        System.out.println(avg);
    }
}

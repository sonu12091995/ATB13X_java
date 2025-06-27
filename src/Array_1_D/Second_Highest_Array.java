package Array_1_D;

public class Second_Highest_Array {
    public static void main(String[] args) {
   //https://www.programiz.com/online-compiler/5hIh9QKcOqXCC
        int []num = {20,30,40,50,60};
       /* Arrays.sort(num);
         System.out.println(num[num.length-2]);*/// Shortest way second highes Array


        int highest  = num[0];
        int secondHighest = Integer.MIN_VALUE;

        // Find the first highest array(same as the find max array)
        for (int i=1; i<num.length; i++)
        {
            if (num[i]>highest)
            {
                highest = num[i];//60
            }
        }

        // find the second highest array

        for (int i=0; i<num.length; i++)
        {
           if (num[i]>secondHighest && num[i]<highest)
           {
               secondHighest = num[i];

           }
        }
        System.out.println("This is the second hoghest array "+ secondHighest);
    }
}

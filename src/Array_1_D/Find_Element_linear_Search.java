package Array_1_D;

public class Find_Element_linear_Search {
    public static void main(String[] args) {


     //https://www.programiz.com/online-compiler/9pgpf29JSY7Tg
        int[] a = {23, 43, 45, 67, 87, 90};
        //Find the target 67, give index ?

         int target = 67;
         for (int i =0; i<a.length; i++)
         {
             if (target==a[i])
             {
                 System.out.println(i);// 3
             }
         }
    }

}

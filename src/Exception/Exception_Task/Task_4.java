package Exception.Exception_Task;

public class Task_4 {
    public static void main(String[] args) {
        /*✅ Task 4: Nested Try-Catch
📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.*/


        try {
            int div = 100 /0;
            System.out.println(div);
        try {
            int[] a = new int [3];
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

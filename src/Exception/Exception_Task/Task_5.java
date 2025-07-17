package Exception.Exception_Task;

public class Task_5 {
    public static void main(String[] args) {
        /*✅ Task 5: Catch Using Exception (Generic Catch)
📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.*/

        String a = null;
        try {
            System.out.println(a.length());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

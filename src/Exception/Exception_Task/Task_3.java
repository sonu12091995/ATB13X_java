package Exception.Exception_Task;

public class Task_3 {
    public static void main(String[] args) {
        /*✅ Task 3: Try-Catch-Finally

📘 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes.*/

        String s = null;
        try {
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The finally block executed");
        }
    }
}

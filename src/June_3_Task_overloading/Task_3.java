package June_3_Task_overloading;


/*Multiply Numbers
Title: Multiply using overloaded methods
Description:
Create a class MathOperations with two multiply() methods:
One takes two integers and returns the product
Another takes three integers and returns their product
This helps students understand how Java distinguishes methods based on parameter count.*/

class MathOperations{
    int multiply(int a , int b){

        return  a*b;
    }

    int multiply(int a , int b, int c){

        return  a*b*c;
    }
}
public class Task_3 {
    public static void main(String[] args) {

    }
}

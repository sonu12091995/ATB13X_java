package June_3_Task_overloading;
/*Task 1: Add Two Numbers
tle: Overload a method to add different types of numbers
Description:
Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
The int version should add two integers.
The double version should add two decimal numbers.
In the main method, call both versions to demonstrate how overloading works with data types.*/
 class calculator {


     int  add(int a, int b){
         return a+b;
     }
    double add(double a, double b){
       return a+b;
   }
}

public class Task_1 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int res = cal.add(23,24);
        System.out.println(res);

        double res1 = cal.add(23.34d,24.45d);
        System.out.println(res1);


    }
    ;

}

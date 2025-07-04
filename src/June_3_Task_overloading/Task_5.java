package June_3_Task_overloading;
/*Find Maximum
Title: Find max using overloaded functions
Description:
Create a class Utility with two methods named max():
max(int a, int b) returns the larger of two integers
max(int a, int b, int c) returns the larger of three integers
max(double a, double b) returns the larger of two decimal values
Add method calls in main() to compare different types.*/

class Utility{
    int max(int a, int b){
        return (a>b)? a:b;//returns the larger of two integers
    }
    int max(int a, int b,int c){
        return (a>b&&a>c)? a : (b>c ? b:c);// returns the larger of three integers
    }
    double max(double a, double b){//
        return (a>b)?a:b; //returns the larger of two decimal values
    }

}
public class Task_5 {
    public static void main(String[] args) {
        Utility uy = new Utility();
        int sum = uy.max(23,45);
        System.out.println(sum);

       double sub =  uy.max(23.44,567.87);
        System.out.println(sub);

        int mul =  uy.max(2,4,4);
        System.out.println(mul);
    }

}

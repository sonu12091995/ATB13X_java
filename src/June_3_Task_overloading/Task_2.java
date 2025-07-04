package June_3_Task_overloading;
/*Task 2: Print Data
Title: Create a universal printer with overloading
Description:
Create a class Printer with multiple printData() methods to handle different data types:
printData(String data)
printData(int data)
printData(float data)
Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.*/
class printer{

    String printData(String a, String b){
        return a+b;
    }
    int printData(int a, int b){
        return a*b;
    }

    float printData(float a, float b){
        return a-b;
    }

}





public class Task_2 {

    public static void main(String[] args) {
        printer pr = new printer();
        String  name = pr.printData("Sonu", "Shqarma");
        System.out.println(name);

        int  name1 = pr.printData(23,23);
        System.out.println(name1);

        float  name2 = pr.printData(2342.2f,23.4f);
        System.out.println(name2);
    }
}

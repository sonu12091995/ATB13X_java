package June_3_Task_overloading;
/*Greet User
Title: Greet users differently using overloading
Description:
Create a class Greeter with the following methods:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!"
This task teaches overloading based on the number of parameters.

*/
class Greeter{
    void greet(){
        System.out.println("Hellow");
    }

    String greet(String name){

        return  "Hello" +name;
    }

}

public class Task_4 {

    public static void main(String[] args) {
        Greeter gr = new Greeter();
       String s = gr.greet("Sonu");
        System.out.println(s);

        gr.greet();
    }
}

package Function_mathod;

public class WithPara_NOReturn {
    // 3.Without Parameters but With Return Type

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);



    }

    public static void main(String[] args) {
        greet_with_details("sonu",30,12.4);
    }
}

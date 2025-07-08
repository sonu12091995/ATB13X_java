package Task_abstract_Method;
/*Description: Show that abstract class can have constructor. Print message from constructor and method.
🔶Expected Output:
Abstract class constructor called
Method from abstract class*/
// Abstract class
 class Fruit {

    // Constructor in abstract class
    Fruit() {
        System.out.println("Abstract class constructor called");
    }

    // Concrete method
    void show() {
        System.out.println("Method from abstract class");

    }
}


// Subclass that extends abstract class
class Mango extends Fruit {
    // No constructor needed here — superclass constructor is automatically called

}

public class Task__3 {
    public static void main(String[] args) {
       Mango m = new Mango();// constructor invoke
        m.show();// Run Method




    }
}

package Task_abstract_Method;

/* Abstract vs Concrete Method
🔶 Objective:
Understand how abstract classes can contain both abstract methods
(which must be implemented in the subclass) and concrete methods (which can be used as-is).
🔶 Steps to Create:
Create an abstract class Parent.
Define one abstract method void show().
Define one concrete method void display() that prints a message.
Create a class Child that extends Parent.
Implement the show() method inside Child.


In the main() method, create an object of Child and call both display() and show().*/
abstract class Parent{

    abstract void show();  // Abstract Mthod

    void display(){
        System.out.println(" Concreate message");
    }
}
// child class
class Child extends Parent{
     void show(){  // Implement the abstract Method
         System.out.println(" This is the abstract method");
    }

}
public class Task_4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}

package Oops_interface.Multiple_Inheritence;
// This can be achive by one class and two interface
interface Animal { // Animal interface
     String name = "Sonu"; // Interface variables are public static final by default

   void dog(); // Abstract method

    default void lion() { // Default method (optional to override)
        System.out.println("This is the lion method");
    }


}

// Interface 2
interface Cat { // Cat interface
    int id = 10; // public static final by default

    void rat(); // Abstract method

    static void car() { // Static method (called via interface name)
        System.out.println("This is the car method");
    }
}

    //create class and implement the abstract method

public class Multiple_Inheritance_two_interface implements Animal,Cat{

    // Implement Animal interface method
    public void dog() {
        System.out.println("This is the dog method");
    }

    // Implement Cat interface method
    public void rat() {
        System.out.println("This is the rat method");
    }

    // Additional method inside the class
    public void classMethod() {
        System.out.println("This is a class-level method");
    }

    public static void main(String[] args) {
        // Create a class object Everything access
        Multiple_Inheritance_two_interface  obj = new  Multiple_Inheritance_two_interface();
        obj.dog();           // From Animal
        obj.rat();           // From Cat
        obj.lion();          // Default method from Animal
        obj.classMethod();   // Class's own method

        Cat.car();           // Static method called using interface name



       /*  Dynamic Dispatch
       Create First Interface object reference to the class
        Note-  Everything access only first Interface But which one create a
         public class Additional method not able to access*/

        Animal animal = new Multiple_Inheritance_two_interface();
        animal.dog();// First-Interface method
        animal.lion();// First Interface
        System.out.println(Animal.name);// class Attribute- first Interface



         /*  Dynamic Dispatch
        Create First Interface object reference to the class
        Note-  Everything access only first Interface But which one create a
         public class Additional method not able to access*/
        Cat cat = new Multiple_Inheritance_two_interface();
        cat.rat();// Abstract
        Cat.car();// Static method called using interface name
        System.out.println(" Static Instance variable " +  Cat.id);


    }

}

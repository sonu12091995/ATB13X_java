package Task_2_July_Inheritance.Single;
   /* Task 1: "Animal Sound Simulator"

📄 Description:  (Single Inheritance + Method Call)

 Create a base class Animal with a method makeSound().
 Then create a derived class Cat that has a method meow().
 In the main method, call both methods using the Cat object.*/




class Animal{
    void makeSound(){
        System.out.println("Sound");
    }
}


// Derived class
class cat extends Animal{
    void meow(){
        System.out.println("This is the meow");
    }
}
public class Main_Runner_Class {
    public static void main(String[] args) {
        cat  myCat = new cat();
        myCat.meow();
        myCat.makeSound();
    }

}


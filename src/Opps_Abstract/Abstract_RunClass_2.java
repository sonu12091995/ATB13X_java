package Opps_Abstract;

// Case --2--
// The abstract Method implement main class
// The abstract class extend the main class
class Animal{
    // This is concreate class or Complete class
    // because does not have abstract method
    void Cat(){
        System.out.println("Concreate class");
    }
}

// Abstract class
abstract class Car{
    abstract  void abstractMethod1();// incomplete method nature in abstract method

    void m2(){
        System.out.println("Complete function");
    }
}


public class Abstract_RunClass_2 extends Car{// Extend the main class
    @Override
    void abstractMethod1(){// Abstract method should be implemented under the public class
        System.out.println("This is the abstract method");

    }
    void additionalMethod(){
        System.out.println("This is the additional method");
    }

    public static void main(String[] args) {
        Animal a= new Animal();
        a.Cat();

        //Car c = new Car()  Abstract class can't create the object

            // child/main class object
        Abstract_RunClass_2 main = new Abstract_RunClass_2();
        main.abstractMethod1(); // Abstract method
        main.additionalMethod();// Aditional method create under the class
        main.m2();// abstract/father class method


       // Dynamic Dispatch

        Car car = new Abstract_RunClass_2();
        car.abstractMethod1();
        car.m2();
        //car.additionalMethod(); Additional method not run







    }
}

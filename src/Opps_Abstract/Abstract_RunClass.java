package Opps_Abstract;

// Case --1--
// The abstract Method implement child class
// The abstract class extend the child class

class car{
    // This is concreate class or Complete class
    // because does not have abstract method
    void done(){
        System.out.println("Concreate class");
    }

    String name = "Sonu";
}

// Abstract class
abstract class father{
abstract  void abstractMethod();// incomplete method nature in abstract method

    void m2(){// normal method
        System.out.println("Complete function");
    }
}


//Normal class
     class Son extends father{
    @Override
      void abstractMethod(){// Abstract method should be implemented under the public class
        System.out.println("This is the abstract method");

    }
    void additionalMethod(){
        System.out.println("This is the additional method");
    }
}


public class Abstract_RunClass {

    public static void main(String[] args) {
        car c = new car(); // concreate class object
        System.out.println(c.name);        //father f = new father();  //Not able to create object abstract class


        //Son object
        Son son = new Son();
        son.abstractMethod();// Father class
        son.m2();// Father class
        son.additionalMethod();// Own class



        // Dynamics dispatch
       father f = new Son();
        f.abstractMethod();
        f.m2();
        //f.additionalMethod()- additional method not run becouse its create under the class



    }
}

package Task_2_July_Inheritance.Single;
/* Task 2: "Vehicle Constructor Chain"

📄 Description:

Create a class Vehicle with a constructor that prints "Vehicle is ready".
Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
 Create an object of Bike in the main method and observe constructor call order.*/

class Vehicle{
    Vehicle(){// constructor-1
        System.out.println("Vehicle is ready");
    }
}
class Bike extends Vehicle{
    Bike(){ // constructor-2
        System.out.println("Bike is ready");
    }
}
public class Constructor_Chain {
    public static void main(String[] args) {
        Bike bike = new Bike();

    }


    }


package June_3_Task_overiding;
/*Task 2: Vehicle Start
Title: Demonstrate engine start behavior using overriding
Description:
Create a base class Vehicle with a method start().
Create Bike and Car classes that override the start() method:
Bike prints "Kick start the bike"
Car prints "Turn the key to start the car"
This shows how polymorphism works with method overriding.*/

class Vehicle{
    void start(){
        System.out.println(" No sound");
    }
        }

class Bike extends Vehicle{
    void start(){
        System.out.println("Kick start the bike");
    }
}
class Car extends Bike{
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
public class Task_2 {
    public static void main(String[] args) {

        Car car  =  new Car(); //Turn the key to start the car
        car.start();

        Bike bike  = new Bike();//Kick start the bike
        bike.start();

        // Dynamic dispatch
        Vehicle ca = new Bike();
         ca.start(); //Kick start the bike

        Vehicle cq = new Car();//Turn the key to start the car
        cq.start();

    }
}

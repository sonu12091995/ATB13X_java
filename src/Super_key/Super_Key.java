package Super_key;
class Vehicle {
    String color = "white";

    void eat(){
        System.out.println("Eating....");
    }
    Vehicle(int a){
        System.out.println("Vehicle parameterized constructor");
    }

    }

    class Bike extends Vehicle{

        String color = "Black";


        void eat(){
            super.eat();// call vehicle(parent) class eat method
        }
        Bike(){
            super(10);// call vehicle(Parent) class parametrized  constructor
        }


        void display(){

            System.out.println(super.color);//white  call parent class
            System.out.println(this.color);//black  call child class

        }
    }


public class Super_Key {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.display();// white
        bike.eat();// Eating....

    }
}

package oops_polymorphism.Overriding;

class Animal{

    void sound(){
        System.out.println("Default sound");
    }
}
class Dog extends Animal{
      @Override
    void sound(){
        System.out.println("Bark");
    }
}

public class Overriding_Examples {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();// Print bark

        //If bark method is not there then prind "Default sound"
    }
}

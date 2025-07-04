package June_3_Task_overiding;
/*Animal Sounds
Title: Override sound behavior in subclasses
Description:
Create a base class Animal with a method sound().
Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.*/
class Animal{
    String sound(){
       return "sound";
    }
}
class Dog extends Animal {
    String sound() {
        return "Bark";
    }
}


    class cat extends Dog {
        String sound() {
            return " Meow";
        }
    }

        class Cow extends cat {
            String sound() {
                return " Moo";
            }
        }

public class Task_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.sound());

        Dog dog  =  new Dog();
        System.out.println(  dog.sound());

        cat Cat = new cat();
        System.out.println(Cat.sound());

        Cow cow  = new Cow();
        System.out.println(cow.sound());

        // Dynamic dispatch

        Animal dog2 = new Dog();
        System.out.println(dog2.sound());// Bark

        Animal cat1 = new cat();
        System.out.println(cat1.sound());// Meow

    }
}

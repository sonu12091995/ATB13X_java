package Task_abstract_Method;
/*Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
🔶 Expected Output:
 Dog barks
Cat meows*/
abstract class Animal{
    abstract void makeSound();
        }
        class Dog extends Animal{
    void makeSound(){
        System.out.println(" Dogs bark");
    }
}
class cat extends Animal {
    void makeSound() {
        System.out.println(" Cat meows");
    }
}
public class Task_1 {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.makeSound();

        Animal en = new cat();
        en.makeSound();


    }
}

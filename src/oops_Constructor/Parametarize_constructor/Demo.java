package oops_Constructor.Parametarize_constructor;

/*If you do not define any constructor, Java automatically provides a default (no-argument)
constructor that initializes instance variables to their default values.*/
class Student{
int id;          // default = 0
String name;     // default = null

// No constructor is defined here
void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
}
}
public class Demo {
    public static void main(String[] args) {
        Student s = new Student(); // Java provides default constructor
        s.display();
    }
}

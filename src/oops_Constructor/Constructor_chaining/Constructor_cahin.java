package oops_Constructor.Constructor_chaining;

public class Constructor_cahin {
   //https://www.programiz.com/online-compiler/8WvWgRQ8F3SFP


    int id;
    String name;

    // Constructor 1: No-arg
    Constructor_cahin() {
       this(101,"Age");  // Calls Constructor 2
        System.out.println("No-arg constructor called");
    }

    // Constructor 2: Parameterized
    Constructor_cahin(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Constructor_cahin e = new Constructor_cahin();
        e.display();
    }
}

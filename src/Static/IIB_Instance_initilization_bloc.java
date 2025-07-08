package Static;

class A{

    A(){// default constructor
        System.out.println("Default constuctor");

    }

    //  IIB block
    {
        System.out.println("This is the IIB block");
        // Here write the code
        // My SQL connection
        //like calling a database connection,
        // calling an Excel collection
    }

}

public class IIB_Instance_initilization_bloc {
    public static void main(String[] args) {
        A a1 = new A(); /*This is the IIB block
                           Default constuctor*/

        A a2 = new A();// Run one more time
                          /*This is the IIB block
                           Default constuctor*/
    }
}

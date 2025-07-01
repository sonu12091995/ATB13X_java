package oops_Constructor;


class student{ // create class by me

  student(){  // Constructor
      System.out.println("Dc");
  }

}

// This s the main public class
public class without_parameter_1 {
    public static void main(String[] args) {

        //create object of the class
        student st = new student();//  output DC invoke by default
        student st1;                // Not run
        new student();             //output DC ,DC two time run
        new student();            //output DC ,DC ,DC three time run

    }
}

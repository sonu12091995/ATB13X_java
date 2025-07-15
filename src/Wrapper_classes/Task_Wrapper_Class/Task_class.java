package Wrapper_classes.Task_Wrapper_Class;

public class Task_class {
    public static void main(String[] args) {
        /*Task 1: Autoboxing and Unboxing
📘 Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
📤 Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50*/

        // Boxing
        int a =50;
        Integer b = a;
        System.out.println("Boxing" +a);
        // unboxing
        Integer b1 = 50;
        int a1 =b1;
        System.out.println("Unboxing "+a1);


        /*Task 2: Converting String to Primitive Using Wrapper
📘 Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.
📤 Expected Output:
Parsed number: 123*/

         String s = "123";
         Integer Iny_value = Integer.parseInt(s);
        System.out.println("String to Primitiv " +Iny_value);

      /*Task 3: Convert int to Integer using Autoboxing
📘 Description:
Declare an int, assign a value, and convert it to Integer using autoboxing.
📤 Expected Output:
Primitive value: 10
Wrapper object: 10*/

        int intValue = 10;
        Integer autoBoxing = intValue;
        System.out.println("Autoboxing  "+autoBoxing);// change  primitive ot wrapper class(Boxing)


/*Task 4: Convert Integer to int using Unboxing
📘 Description:
Create an Integer object and convert it back to primitive using unboxing(Unboxing).
📤 Expected Output:
Integer object: 20
Unboxed primitive: 20*/

        Integer integer = 20;
        int unBoxing = integer;
        System.out.println(unBoxing);// convert wrapper to primitive data type
/*Task 5: Compare Wrapper objects using == and equals()
📘 Description:
Compare two Integer objects using == and .equals() and print the results.
Expected Output:
a == b: true
c == d: false
a.equals(b): true
c.equals(d): true*/
        Integer a2 = 100;
        Integer b2 = 100;

        // Values outside the cache range
        Integer c = 150;
        Integer d = 150;

        System.out.println("Comparing Integer with " +(a2==b2));//true

        // getting false because by default By default, the Integer class caches values from -128 to 127.
        System.out.println("Comparing Integer with " +(c==d));

       System.out.println("Comparing Integer equal " +a2.equals(b2));//true
        System.out.println("Comparing Integer equal " +c.equals(d));//true





    }
}

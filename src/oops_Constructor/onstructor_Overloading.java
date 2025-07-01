package oops_Constructor;
class Person1 {

    String name;
    long phone;
    String address;

    Person1() {  // constructor-1

    }

    Person1(String name_arg, long phone_arg, String address_arg) {// constructor-2
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person1(String name_arg, long phone_arg) {// constructor-3
        this.name = name_arg;
        this.phone = phone_arg;

    }
}
public class onstructor_Overloading {
    public static void main(String[] args) {

        Person1 p1 = new Person1("sonu",98343453,"qweqwrwqr");// 2nd constructor run
        System.out.println(p1.name);
        System.out.println(p1.address);

        Person1 p2 = new Person1("monu",9834345);//  3rd constructor run
        System.out.println(p2.name);


    }
}


package Generics;

class genericClass<T>{

    private T Data;// Variable

    public genericClass(T data) {// getter
        this.Data = data;
    }




    public T getData() {// setter
        return Data;
    }

    public void setData(T data) {// constructor
        this.Data = data;
    }

void display(){
    System.out.println(Data);
}


}

public class Generic_class_real {
    public static void main(String[] args) {
        genericClass obj = new genericClass(23);// int data
        obj.display();


        genericClass obj1 = new genericClass("sonu");// string data

    }
}

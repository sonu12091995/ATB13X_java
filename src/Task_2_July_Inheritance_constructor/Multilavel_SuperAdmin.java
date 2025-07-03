package Task_2_July_Inheritance_constructor;
/*Task 3: "Multilevel Login System"

📄 Description: (Multilevel Inheritance)
Create a class User with a method login().
Extend it with a class AdminUser that adds a method accessAdminPanel().
Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

Use an object of SuperAdmin to call all three methods.*/


class User{
    void  login(){
        System.out.println("Login method");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Access the Admin panel");
    }

}

class SuperAdmin extends AdminUser{
    void ShutDown(){
        System.out.println("ShutDown the method");
    }
}


public class Multilavel_SuperAdmin {
    public static void main(String[] args) {
        SuperAdmin Au = new SuperAdmin();
        Au.ShutDown();
        Au.accessAdminPanel();
        Au.login();
    }
}

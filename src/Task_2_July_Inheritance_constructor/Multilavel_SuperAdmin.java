package Task_2_July_Inheritance_constructor;

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

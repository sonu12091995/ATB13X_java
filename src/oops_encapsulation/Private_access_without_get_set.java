package oops_encapsulation;


class login{
     private String username;
      private  String password;


public login(String username, String password){// Parameterized constructor
    this.username = username;
    this.password = password;
}
}
public class Private_access_without_get_set {
    public static void main(String[] args) {
        login lo = new login("sneh@1243","23424");
        //System.out.println(lo.username);// not able to access getting error this class is private
        //System.out.println(lo.password);
    }
}

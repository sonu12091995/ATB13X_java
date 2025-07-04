package oops_encapsulation;

class loginPage {

    private String username;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
            this.username = username;
    }

    public loginPage(String username, String password) {// Parameterized constructor
        this.username = username;
        this.password = password;
    }
}
public class Private_access_with_get_set_method {
    public static void main(String[] args) {

        loginPage lo = new loginPage("Sonu Sharma", "Sonu123");
        System.out.println(lo.getPassword()); //Sonu123

        System.out.println(lo.getUsername());// Sonu Sharma



        // we can access but can't set the  new user and new pass
        /*System.out.println(lo.setUsername());// getting error
        System.out.println(lo.setPassword();*/ // getting error



    }
}

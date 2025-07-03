package oops_encapsulation;
class loginFb {

    private String username;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {// set cond boolean isAdmin then change the password
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Nothing to change the password");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username, boolean isAdmin) {// set cond boolean isAdmin then change the username
        if (isAdmin) {
            this.username = username;
        } else {
            System.out.println("Nothing to change the username");
        }
    }

    public loginFb(String username, String password) {// Parameterized constructor
        this.username = username;
        this.password = password;
    }
}

    public class Set_User_Password {
        public static void main(String[] args) {
            loginFb lo = new loginFb("Sonu Sharma", "Sonu123");

            // change username
            lo.setUsername("123", true);// if false unable to change the username
            System.out.println("New username: " + lo.getUsername());// New username: 123

            // change password
            lo.setPassword("123", true);// if its false unable to change the password
            System.out.println(lo.getPassword());// 123 new password

        }
    }


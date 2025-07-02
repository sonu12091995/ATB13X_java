package oops_Constructor.Parametarize_constructor;


class baby{
    String name;
    String Aadhar;
    int year;
    int month;

    baby(String name_user, String Aadhar_user, int year_user, int month_user){
        this.name = name_user;
        this.Aadhar = Aadhar_user;
        this.year = year_user;
        this.month = month_user;

    }
}
public class With_Paramtere {
    public static void main(String[] args) {
        baby b1 = new baby("Sonu","12345678",2000,5);
        System.out.println(b1.name);//Sonu
        System.out.println(b1.Aadhar);//12345678

        // Second object create initialized the another value
        baby b2 = new baby("Monu","987654321",20020,11);
        System.out.println(b2.name);//Monu
        System.out.println(b2.Aadhar);//987654321


    }
}

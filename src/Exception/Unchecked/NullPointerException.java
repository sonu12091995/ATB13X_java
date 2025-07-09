package Exception.Unchecked;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        /*String name= null; // java.lang.NullPointerException
        name.trim();
*/
        // Second


        String a = null;
        try{
            System.out.println(a.length()); //java.lang.NullPointerException
        }catch (Exception e){
            System.out.println(" String should not null");
            System.out.println(e.getMessage());// you want description message   exception
        }
        System.out.println(a);
    }
}

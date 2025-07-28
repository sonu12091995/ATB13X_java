package String_Methods;

public class RemoveAll {
    public static void main(String[] args) {
        String s = "$Sonu@123@live.com";
        s = s.replaceAll("[@.]", "");  // removes @ and .
        System.out.println(s);
    }
}

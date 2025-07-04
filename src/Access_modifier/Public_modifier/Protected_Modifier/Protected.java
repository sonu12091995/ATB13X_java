package Access_modifier.Public_modifier.Protected_Modifier;

import Access_modifier.Public_modifier.All_modifier_here;

public class Protected extends All_modifier_here {
    public static void main(String[] args) {
        All_modifier_here v = new All_modifier_here();

        // Access protected variable not able to access out of the package

        /*String p =  v.age();
        System.out.println();*/
    }
}

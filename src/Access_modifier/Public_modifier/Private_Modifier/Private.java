package Access_modifier.Public_modifier.Private_Modifier;

import Access_modifier.Public_modifier.All_modifier_here;

public class Private extends All_modifier_here {
    public static void main(String[] args) {
        All_modifier_here v = new All_modifier_here();

        // Access private variable not able to access out of the package
        /*String p = v.name:
        System.out.println(p);*/
    }
}

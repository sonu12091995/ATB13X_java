package Access_modifier.Public_modifier;

public class All_modifier_here {

    private String name = "Private Name";          // Accessible only within this class
    String city = "Default City";                  // Default (package-private)
    protected int age = 25;                        // Accessible in same package and subclasses
    public String country = "India";               // Accessible everywhere
}

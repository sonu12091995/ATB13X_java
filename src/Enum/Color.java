package Enum;

public enum Color {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    Color(String hexCode){// constructor
        this.hexCode = hexCode;
    }

    String getHexCode(){// Get Method
        return this.hexCode;
    }

}

package Enum;

public enum Locators {

    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }
}


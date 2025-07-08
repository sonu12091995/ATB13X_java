package Enum;

public class Automation_Enum_locators {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        // Color enum class
        System.out.println(Color.RED.getHexCode());
        System.out.println(Color.GREEN.getHexCode());

        // URL
        System.out.println(Url.vwo.getUrl());
        System.out.println(Url.google.getUrl());
    }
}

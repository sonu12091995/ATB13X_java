package Enum;

public enum Url {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Url(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }

}

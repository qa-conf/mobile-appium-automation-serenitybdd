package co.qaconf.utils;

public enum MenuEnum {
    PRINCIPAL("Home", "Principal"),
    SHORTS("Shorts", "Shorts"),
    SUSCRIPCIONES("Subscriptions", "Suscripciones"),
    TU("Tú", "Tú"),
    LIBRARY("Library", "Library"),
    HISTORIAS("Library", "Library");

    private final String valorAndroid;
    private final String valorIOS;

    MenuEnum(String valorAndroid, String valorIOS) {
        this.valorAndroid = valorAndroid;
        this.valorIOS = valorIOS;
    }

    public String getValorSegunPlataforma(String plataforma){
        if("Android".equals(plataforma)){
            return valorAndroid;
        }else {
            return valorIOS;
        }
    }
}

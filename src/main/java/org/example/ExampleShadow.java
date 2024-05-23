package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class ExampleShadow {
    public static void main(String[] args) {

        Locale locale = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("language", locale);

        System.out.println(bundle.getString("hello"));
    }
}
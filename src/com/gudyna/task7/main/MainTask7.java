package com.gudyna.task7.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainTask7 {
    public static void main(String[] args) {
        System.out.println("1-eng\n2-bel\n3 - rus");
        char i = 0;
        try{
           i = (char)System.in.read();
        } catch (IOException e){
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i){
            case '1'->{
                country ="US";
                language="en";
            }
            case '2'->{
                country = "BY";
                language = "be";
            }
            default -> {
                country = "BY";
                language = "be";
            }
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
        String s1 = rb.getString("str1");
        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
    }

}

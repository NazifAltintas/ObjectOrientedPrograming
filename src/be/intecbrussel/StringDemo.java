package be.intecbrussel;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String text = "very money ";
        text = text.toUpperCase();
        text = text.concat("very happy");
        text = text.replace("", "/");
        String textToUpper = text.substring(20, 30); //  Shift+F6 change name of variables,
        text = text.replace(textToUpper, textToUpper.toUpperCase(Locale.ROOT));


        System.out.println(text);
    }
}

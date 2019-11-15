
package com.senla.task.third;


public class TextUtil {

    public static String upperLetter(String word) {
        word = word.trim();
        String firstLetter = word.substring(0, 1).toUpperCase();
        word = firstLetter + word.substring(1);

        return word;
    }

}
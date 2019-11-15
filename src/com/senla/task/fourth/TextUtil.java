package com.senla.task.fourth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtil {
    public static int getWordCount(String text, String word) {
        if (word.equals(" ") || text.equals(""))
            throw new IllegalArgumentException("Вы ввели слово с пробелом или пробел");

        text = text.toLowerCase();
        word = word.toLowerCase();

        int wordCount = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}

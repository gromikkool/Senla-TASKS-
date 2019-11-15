package com.senla.task.third;

import java.util.Arrays;

public class ThirdMain {
    public static void main(String[] args) {
        TextReader textReader = new TextReader();

        System.out.print("Введите текст разделяя слова пробелом: ");
        String input = textReader.readString().trim();

        String[] words = input.split(" ");
        int wordsCount = words.length;

        //upperCase to first letter in words
        String[] upperLetterWords = Arrays.stream(words)
                .map(TextUtil::upperLetter)
                .toArray(String[]::new);

        Arrays.sort(upperLetterWords);

        System.out.print("Оригинальный текст: ");
        System.out.println(input);

        System.out.print("Количество слов в предложении: ");
        System.out.println(wordsCount);

        System.out.print("Отсортированные слова по алфавиту:\n");
        for (String word : upperLetterWords) {
            System.out.println(word);
        }
    }

}
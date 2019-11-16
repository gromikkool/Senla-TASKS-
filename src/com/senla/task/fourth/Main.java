package com.senla.task.fourth;


import com.senla.task.third.TextReader;

import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {
        try {

            TextReader textReader = new TextReader();
            System.out.println("Введите текст: ");
            String s = textReader.readString();
            System.out.println("Введите слово для поиска по тексту: ");
            String word = textReader.readString();
            System.out.println(TextUtil.getWordCount(s, word));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());

        }
    }
}

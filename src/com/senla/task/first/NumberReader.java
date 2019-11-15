package com.senla.task.first;

import java.io.InputStream;
import java.util.Scanner;

public class NumberReader {

    private Scanner scanner;

    public NumberReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public int readInt(){
        while (true) {
            String inputText = scanner.nextLine();
            if (inputText.equals("exit"))
                System.exit(-1);
            try {
                return Integer.parseInt(inputText);
            }catch (NumberFormatException e){
                System.out.println("Ошибка: " + e.getLocalizedMessage());
            }
        }
    }
}


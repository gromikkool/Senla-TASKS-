package com.senla.task.third;

import java.util.Scanner;

public class TextReader {
    Scanner scan = new Scanner(System.in);

    public String readString()
    {
        String text = scan.nextLine();
        return text;
    }

}

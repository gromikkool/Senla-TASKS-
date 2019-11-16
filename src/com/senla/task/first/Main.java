package com.senla.task.first;

public class Main {

    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader(System.in);
        System.out.print("Введите число: ");
        int number = numberReader.readInt();

        if (NumberUtil.isEven(number)) {
            System.out.println("Чётное");
        } else
            System.out.println("Нечётное");

        if (NumberUtil.isComposite(number)) {
            System.out.println("Это число простое ");
        } else
            System.out.println("Это число составное");

    }
}

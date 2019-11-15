package com.senla.task.first;

public class NumberUtil {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isComposite(int number) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}


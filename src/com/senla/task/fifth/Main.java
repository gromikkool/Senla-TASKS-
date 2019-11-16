package com.senla.task.fifth;

import com.senla.task.first.NumberReader;


public class Main {
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader(System.in);
        System.out.println("Введите длину последовательности, она не должна быть больше 100 и меньше 0: ");
        int number = numberReader.readInt();
        if (!(number < 0 || number > 100)) {
            for (int i = 0; i < number + 1; i++) {
                if (NumUtil.isPalindrome(i))
                    System.out.println(i);
            }

        } else
            System.out.println("Вы ввели неверную длину: ");

    }

}

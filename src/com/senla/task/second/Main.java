package com.senla.task.second;

import com.senla.task.first.NumberReader;

public class Main {
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader(System.in);
        int firstNumber = numberReader.readInt();
        int secondNumber = numberReader.readInt();
        System.out.println("НОД = " + NumberUtil.gcd(firstNumber, secondNumber));
        System.out.println("НОК = " + NumberUtil.lcm(firstNumber, secondNumber));
    }
}

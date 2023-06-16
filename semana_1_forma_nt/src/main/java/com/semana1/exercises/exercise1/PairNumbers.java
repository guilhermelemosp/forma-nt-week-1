package com.semana1.exercises.exercise1;

public class PairNumbers {
    public String setPairNumbers() {
        String pairNumbers = "";

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                pairNumbers += i + " ";
            }
        }

        return pairNumbers;
    }

}

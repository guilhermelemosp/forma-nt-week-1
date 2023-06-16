package com.semana1.exercises.exercise1;

public class EvenNumbers {
    public String setEvenNumbers() {
        String EvenNumbers = "";

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                EvenNumbers += i + " ";
            }
        }

        return EvenNumbers;
    }

}

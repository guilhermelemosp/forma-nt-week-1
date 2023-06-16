package com.semana1.exercises.exercise2;

public class PrimeNumbers {
    public String primeNumbersString() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 0; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        return primeNumbers;
    }
}

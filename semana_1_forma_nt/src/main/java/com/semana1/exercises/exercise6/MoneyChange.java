package com.semana1.exercises.exercise6;

public class MoneyChange {
    public void printChange(double cost, double payment) {
        double change = payment - cost;
        System.out.println("Custo: " + cost);
        System.out.println("--------------------");
        System.out.println("Troco: " + change);
        System.out.println("--------------------");
        System.out.println("Menor Troco: ");
        
        int[] notes = { 100, 50, 20, 10, 5, 2, 1 };
        double[] coins = { 1.00, 0.50, 0.25, 0.10, 0.05 };
        boolean firstItem = true;

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
            while (change >= note) {
                //se nao for o primeiro item
                if (!firstItem) {
                    System.out.print(", ");
                }
                System.out.print(note);
                change -= note;
                // altera o FirstItem para false
                firstItem = false;
            }
        }
        
        for (int i = 0; i < coins.length; i++) {
            double coin = coins[i];
            while (change >= coin) {
                if (!firstItem) {
                    System.out.print(", ");
                }
                System.out.print(coin);
                change -= coin;
                
                firstItem = false;
            }
        }
        System.out.println(".");
}
}
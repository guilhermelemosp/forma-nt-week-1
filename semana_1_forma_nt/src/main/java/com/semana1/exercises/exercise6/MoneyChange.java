package com.semana1.exercises.exercise6;
import com.semana1.exercises.exercise6.utils.CashData;
import com.semana1.exercises.exercise6.utils.Organize;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyChange {
    public void printChange(double cost, double payment) {
        CashData cashData = new CashData();
        Organize organize = new Organize();

        BigDecimal costBD = BigDecimal.valueOf(cost);
        BigDecimal paymentBD = BigDecimal.valueOf(payment);
        BigDecimal changeBD = paymentBD.subtract(costBD).setScale(2, RoundingMode.HALF_UP);

        organize.printTop();
        System.out.println("Custo: " + costBD);
        organize.printTop();
        System.out.println();        
        System.out.println("Troco: " + changeBD);
        organize.printTop();
        System.out.println("Menor Troco: ");

        for (int i = 0; i < cashData.cashes.length; i++) {
            BigDecimal cash = BigDecimal.valueOf(cashData.cashes[i]);
            while (changeBD.compareTo(cash) >= 0) {
                //se nao for o primeiro item
                if (!cashData.firstItem) {
                    System.out.print(", ");
                }
                System.out.print("Uma nota de R$" + cash);
                changeBD = changeBD.subtract(cash);
                // altera o FirstItem para false
                cashData.firstItem = false;
            }
        }

        for (int i = 0; i < cashData.coins.length; i++) {
            BigDecimal coin = cashData.coins[i];
            while (changeBD.compareTo(coin) >= 0) {
                if (!cashData.firstItem) {
                    System.out.print(", ");
                }
                System.out.print("Uma moeda de R$" + coin );
                changeBD = changeBD.subtract(coin);

                cashData.firstItem = false;
            }
        }
        System.out.println(".");
        organize.printBottom();
    }
}

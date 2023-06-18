package com.semana1.exercises.exercise6.utils;
import java.math.BigDecimal;

public class CashData {
    public int [] cashes = { 100, 50, 20, 10, 5, 2 };
    
    public BigDecimal[] coins = { 
        BigDecimal.valueOf(1.00), BigDecimal.valueOf(0.50),
        BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.10),
        BigDecimal.valueOf(0.05) 
    };
    
    public boolean firstItem = true;
}

package com.example.exercisesTests.exerciseTest4;

import com.semana1.exercises.exercise4.DriverInfo;

// 

//imprima no console o nome, cargo e placa do carro de dois motoristas
public class DriverInfoTest {
    public static void main(String[] args) {
        DriverInfo driver1 = new DriverInfo();
        DriverInfo driver2 = new DriverInfo();

        driver1.getDriver("João", "123456789-00", "123456789", "30", "Motorista", "R$ 2.000,00", "123456789", "ABC-1234");
        driver2.getDriver("Maria", "987654321-00", "987654321", "25", "Motorista", "R$ 2.000,00", "987654321", "XYZ-9876");

        driver1.printDriver(driver1);
        driver2.printDriver(driver2);
      
    }
}

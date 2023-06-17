package com.semana1.exercises.exercise4;

// Uma pessoa possui nome, cpf rg e identidade
// Um funcionário possui nome, cpf, rg, identidade, idade, cargo e salário
// Um motorista possui nome, cpf, rg, identidade, idade, cargo, salário, cnh e placa do carro
// Monte a estrutura de classes, instancie dois motoristas e imprima no console o nome, cargo e placa do carro de cada um deles

public class DriverInfo {
    private String name;
    private String cpf;
    private String id;
    private String age;
    private String job;
    private String salary;
    private String driversLicense;
    private String licenseplate;

    public void getPersonInfo(String name, String cpf, String id, String age) {
        this.name = name;
        this.cpf = cpf;
        this.id = id;
        this.age = age;
    }

    public void getEmployeeInfo(String name, String cpf, String id, String age, String job, String salary) {
        this.getPersonInfo(name, cpf, id, age);
        this.job = job;
        this.salary = salary;
    }

    public void getDriver(String name, String cpf, String id, String age, String job, String salary, String driversLicense, String licenseplate) {
        this.getEmployeeInfo(name, cpf, id, age, job, salary);
        this.driversLicense = driversLicense;
        this.licenseplate = licenseplate;
    }

    public void printDriver(DriverInfo driveriInfo) {
        System.out.println("Nome: " + driveriInfo.name);
        System.out.println("Cargo: " + driveriInfo.job);
        System.out.println("Placa do carro: " + driveriInfo.licenseplate);
    }

   
    
}


package com.oop.introduction;

public class Introduction {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMake("tesla");
//        car.setColor("Black");
//        car.setConvertible(true);
//        car.setDoors(4);
//        car.setModel("Beast");
//        car.describeCar();

//        BankAccount bankAccount = new BankAccount("01019292039020","Ivan E",1200,"ivane@gmail.com","(256) 7004-85851");
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.depositFunds(1000);
//        bankAccount.withDraw(900);
//        bankAccount.withDraw(1000);
//        bankAccount.withDraw(100);

//        System.out.println("=====================");
//        BankAccount leilah = new BankAccount("Namatovu Leilah","namatovuleilah@gmail.com","0758865330");
//        leilah.depositFunds(1500);
//        leilah.withDraw(100);

        Customer customer = new Customer("Riham","riham@rh.com",6000);
        System.out.println("Name: "+customer.getName());
        System.out.println("Email: "+customer.getEmail());
        System.out.println("Credit Limit: "+customer.getCreditLimit());
    }
}

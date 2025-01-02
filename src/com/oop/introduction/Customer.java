package com.oop.introduction;

public class Customer {
    private String name;
    private String email;
    private double creditLimit;

    public Customer() {
        this("Amazon","amazon@amazon.com");
    }

    public Customer(String name, String email) {
        this(name,email, 300);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

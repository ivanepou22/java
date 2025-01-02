package com.objectOrientedProgramming;

public class Account {
    private String accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;

    public Account(){
        this("0101019209212226","Ivan",1000.00,"ivani@gmail.com","256-700-4851231"); //constructor chaining
        System.out.println("Constructor Called");
    }
    public Account(String accountNumber, String customerName, double balance, String email, String phoneNumber){
        System.out.println("Second Constructor");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public  void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        System.out.println("Name: "+getCustomerName());
        System.out.println("AccountNo.: "+getAccountNumber());
        System.out.println("PhoneNo.: "+getPhoneNumber());
        System.out.println("Email: "+getEmail());
        System.out.println("Previous Balance: "+balance);
        balance += amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Current Balance: "+balance);
    }

    public void withdrawFunds(double amount){
        if (amount > getBalance()){
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Name: "+getCustomerName());
            System.out.println("AccountNo.: "+getAccountNumber());
            System.out.println("PhoneNo.: "+getPhoneNumber());
            System.out.println("Email: "+getEmail());
            System.out.println("Previous Balance: "+balance);
            balance -= amount;
            System.out.println("Withdrawn Amount: "+ amount);
            System.out.println("Available Balance: "+ balance);
        }
    }
}
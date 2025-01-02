package com.company;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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


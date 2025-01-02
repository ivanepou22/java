package com.oop.introduction;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private double accountBalance;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("00019202","Default Customer",0.00,"default@gmail.com","(256) 700000000");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String accountNumber, String customerName, double accountBalance, String email, String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("0219209020", customerName, 150.00,email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void depositFunds(double amount){
        System.out.println("==========Deposit===========");
        System.out.println("AccountNo.: "+getAccountNumber());
        System.out.println("PhoneNo.: "+getPhoneNumber());
        System.out.println("Email: "+getEmail());
        System.out.println("Previous Balance: "+accountBalance);
        accountBalance += amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Current Balance: "+accountBalance);
    }

    public void withDraw(double amount) {
        System.out.println("===========Withdrawal===========");
        accountBalance -= amount;
        if (accountBalance < 0){
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("AccountNo.: "+getAccountNumber());
            System.out.println("PhoneNo.: "+getPhoneNumber());
            System.out.println("Email: "+getEmail());
            System.out.println("Previous Balance: "+(accountBalance+ amount));
            System.out.println("Withdrawn Amount: "+ (-1 * amount));
            System.out.println("Available Balance: "+ accountBalance);
        }
    }
}

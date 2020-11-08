package com.company;

public class Account {
    private double balance;
    public Account()
    {
        //default constructor
    }
    public Account(double balance)
    {
    this.balance=balance;

    }

    public double getBalance() {
        return balance;
    }
    public double withdraw(double amount)
    {
     balance = balance-amount;
     return balance;
    }
    public double deposit (float amount)
    {
        balance=balance+amount;
        return balance;
    }
}

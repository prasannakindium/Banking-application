package com.mybankingapp;
class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.07;
        deposit(interest);
    }
}
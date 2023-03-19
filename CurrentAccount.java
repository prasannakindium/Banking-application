package com.mybankingapp;
class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }

    public void deductFee() {
        double amount = getBalance();
        if (amount > 50000) {
            double fee = (amount - 50000) / 10000 * 5;
            withdraw(fee);
        }
    }
}
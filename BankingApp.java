package com.mybankingapp;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter savings account balance: ");
        double savingsBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsBalance);

        System.out.print("Enter current account balance: ");
        double currentBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentBalance);

        System.out.print("Enter amount to deposit into savings account: ");
        double savingsDeposit = scanner.nextDouble();
        savingsAccount.deposit(savingsDeposit);

        System.out.print("Enter amount to withdraw from savings account: ");
        double savingsWithdrawal = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdrawal);
        savingsAccount.calculateInterest();

        System.out.print("Enter amount to deposit into current account: ");
        double currentDeposit = scanner.nextDouble();
        currentAccount.deposit(currentDeposit);

        System.out.print("Enter amount to withdraw from current account: ");
        double currentWithdrawal = scanner.nextDouble();
        currentAccount.withdraw(currentWithdrawal);
        currentAccount.deductFee();

        System.out.println("Savings account balance: " + savingsAccount.getBalance());
        System.out.println("Current account balance: " + currentAccount.getBalance());
    }
}
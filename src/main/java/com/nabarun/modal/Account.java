package com.nabarun.modal;

import com.nabarun.transaction.WithdrawTransaction;

public class Account {
    private Long accountNumber;
    private String bankName;
    private Long balance;

    public Account(Long accountNumber,String bankName,Long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    public Long getBalance() {
        return balance;
    }

    public void withdraw(Long amount){
        if(amount <= 0){
            throw new RuntimeException("Amount must be positive");
        }

        if(balance < amount){
            throw new RuntimeException("Insufficient balance");
        }

        balance -= amount;

        System.out.println("Remaining balance: " + balance);
    }

    public void showBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void deposit(long amount){
        if(amount <= 0){
            throw new RuntimeException("Amount must be positive");
        }
        balance += amount;

        System.out.println("Updated balance: " + balance);
    }
}


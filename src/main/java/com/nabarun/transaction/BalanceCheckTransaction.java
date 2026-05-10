package com.nabarun.transaction;

import com.nabarun.modal.Account;

import java.sql.SQLOutput;

public class BalanceCheckTransaction extends Transaction{
    private Account account;

    public BalanceCheckTransaction(Account account){
        this.account=account;
    }
    @Override
    public void execute() {
        this.account.showBalance();
    }
}

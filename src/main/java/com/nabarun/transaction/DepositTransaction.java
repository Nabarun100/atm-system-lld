package com.nabarun.transaction;

import com.nabarun.modal.Account;

public class DepositTransaction extends Transaction{
    private Long amount;
    public DepositTransaction(Account account,long amount){
        this.amount=amount;
        this.account=account;
    }

    @Override
    public void execute() {
        this.account.deposit(amount);
    }
}

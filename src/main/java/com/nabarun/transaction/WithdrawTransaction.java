package com.nabarun.transaction;

import com.nabarun.modal.Account;

public class WithdrawTransaction extends Transaction{
    private final Long amount;

    public  WithdrawTransaction(Account account,Long amount){
     this.account=account;
     this.amount = amount;
    }
    @Override
    public void execute(){
        this.account.withdraw(amount);
    }
}

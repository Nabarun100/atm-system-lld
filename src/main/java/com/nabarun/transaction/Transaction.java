package com.nabarun.transaction;

import com.nabarun.modal.Account;

public abstract class Transaction {
    protected String transactionId;
    protected Account account;

    public abstract void execute();
}

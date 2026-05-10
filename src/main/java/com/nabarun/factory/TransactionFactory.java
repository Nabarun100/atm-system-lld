package com.nabarun.factory;

import com.nabarun.modal.Account;
import com.nabarun.transaction.*;

public class TransactionFactory {


    public Transaction getTransaction(TransactionType type, Account account, long amount){
            if(type==TransactionType.WITHDRAW){
            return new WithdrawTransaction(account,amount);
        }else if(type==TransactionType.BALANCE_CHECK){
            return new BalanceCheckTransaction(account);
        }else if(type==TransactionType.DEPOSIT){
                return new DepositTransaction(account,amount);
        }else{
            throw new RuntimeException("Invalid Transaction");
        }
    }
}

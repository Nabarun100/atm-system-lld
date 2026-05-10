package com.nabarun.state;

import com.nabarun.factory.TransactionFactory;
import com.nabarun.modal.ATM;
import com.nabarun.modal.Account;
import com.nabarun.modal.Card;
import com.nabarun.transaction.Transaction;
import com.nabarun.transaction.TransactionType;

public class AuthenticatedState implements ATMState{
    private ATM atm;
    public AuthenticatedState(ATM atm) {
        this.atm = atm;
    }
    public void ejectCard(){
        atm.setCurrentAccount(null);
        atm.setCurrentCard(null);
        atm.setCurrentState(new NoCardState(atm));
    }
    public void injectCard(Card card){
        System.out.println("Already a card is inserted cannot perform this action");
    }
    public void selectTransaction(TransactionType type, long amount){
        TransactionFactory transactionFactory = new TransactionFactory();
        Transaction transaction = transactionFactory.getTransaction(type,atm.getCurrentAccount(),amount);
        transaction.execute();

    }
    public  void enterPin(){
        System.out.println("Already authenticated");
    }
}

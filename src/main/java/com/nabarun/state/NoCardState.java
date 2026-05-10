package com.nabarun.state;

import com.nabarun.modal.ATM;
import com.nabarun.modal.Account;
import com.nabarun.modal.Card;
import com.nabarun.transaction.TransactionType;

public class NoCardState implements ATMState{
    private ATM atm;
    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    public void ejectCard(){
        System.out.println("Not possible");
    }
    public void injectCard(Card card){
        System.out.println("Card inserted");
        atm.setCurrentCard(card);
        atm.setCurrentAccount(card.getAccount());
        atm.setCurrentState(new HasCardState(atm));
    }
    public void selectTransaction(TransactionType type,  long amount){
        System.out.println("Not possible");
    }
    public  void enterPin(){
        System.out.println("Not possible");
    }
}

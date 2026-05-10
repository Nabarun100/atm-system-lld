package com.nabarun.state;

import com.nabarun.modal.ATM;
import com.nabarun.modal.Account;
import com.nabarun.modal.Card;
import com.nabarun.transaction.TransactionType;

public class HasCardState implements ATMState{
    private ATM atm;
    public HasCardState(ATM atm) {
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
        System.out.println("Validate first");
    }
    public  void enterPin(){
        System.out.println("PIN entered");
        atm.setCurrentState(new AuthenticatedState(atm));
    }
}

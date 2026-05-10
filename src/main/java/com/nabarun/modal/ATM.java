package com.nabarun.modal;

import com.nabarun.state.ATMState;
import com.nabarun.state.NoCardState;
import jdk.jfr.DataAmount;

public class ATM {
    private ATMState currentState;
    private Card currentCardId;
    private Account curentAccount;

    public ATM() {
        this.currentState = new NoCardState(this);
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public void setCurrentCard(Card card){
        this.currentCardId=card;
    }

    public void setCurrentAccount(Account account){
        this.curentAccount=account;
    }

    public Account getCurrentAccount(){
        return this.curentAccount;
    }
}

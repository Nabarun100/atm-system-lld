package com.nabarun.state;

import com.nabarun.modal.Account;
import com.nabarun.modal.Card;
import com.nabarun.transaction.TransactionType;

public interface ATMState {
    public void ejectCard();
    public void injectCard(Card card);
    public void selectTransaction(TransactionType type, long amount);
    public  void enterPin();
}

package com.nabarun;

import com.nabarun.factory.TransactionFactory;
import com.nabarun.modal.ATM;
import com.nabarun.modal.Account;
import com.nabarun.modal.Card;
import com.nabarun.transaction.Transaction;
import com.nabarun.transaction.TransactionType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account =
                new Account(1L, "Axis", 1000L);
        Card card = new Card();
        card.setAccount(account);
        ATM atm=new ATM();
        atm.getCurrentState().injectCard(card);
        atm.getCurrentState().enterPin();
        atm.getCurrentState().selectTransaction(TransactionType.DEPOSIT,650);


    }
}
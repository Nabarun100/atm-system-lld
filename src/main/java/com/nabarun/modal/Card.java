package com.nabarun.modal;

import java.time.LocalDateTime;

public class Card {
    private Long cardNumber;
    private LocalDateTime expiryDate;
    private Integer pin;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

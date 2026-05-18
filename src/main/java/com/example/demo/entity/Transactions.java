package com.example.demo.entity;

import java.time.LocalDateTime;
public class Transactions {
    public static int transactionNumber = 1;
    int transactionId;
    int amount = 0;
    String transactionType = "";
    LocalDateTime transactionDate;

    public Transactions(int amount, String transactionType) {
        this.transactionId = transactionNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = LocalDateTime.now();
        transactionNumber++;
    }
}

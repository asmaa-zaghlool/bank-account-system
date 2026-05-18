package com.example.demo.entity;
import java.util.ArrayList;

public class Account {
    private String accountPassword;
    private String accountName;
    private int balance = 0;
    // Every account have daily withdrawal limit if they will not be able to exceed this limit
    public static int dailyWithdrawalLimit = 500;
    //This variable increases whenever the account makes a withdrawal
    private int dailyAmount = 0;
    private ArrayList<Transactions> transactionsArrayList = new ArrayList<>();
    private boolean status = false;


    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountName() {
        return accountName;
    }

    // Set the balance and check whether it is greater than 0
    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("Invalid Balance");
        }
        else {
            this.balance = balance + this.balance;
        }
    }
    public int getBalance() {
        return balance;
    }

    // Adding balance to the account
    public String deposit(int amount) {
        if(status == true) {
            return "the Account is closed!";
        }
        else {
            setBalance(amount);
            Transactions t = new Transactions(amount, "deposit");
            transactionsArrayList.add(t);
            return ("Your Balance is now: " + this.balance);
        }
    }

    // Deducting balance from the account
    public String withdraw(int amount) {
        if (status == true) {
            return "the Account is closed!";
        }else{
            if (balance < amount) {
                return "Insufficient Balance";
            }
            else {
                if(amount + dailyAmount <= dailyWithdrawalLimit) {
                    dailyAmount = amount + dailyAmount;
                    balance -= amount;
                    Transactions t = new Transactions(amount, "withdrawal");
                    transactionsArrayList.add(t);
                    return ("Your Balance is now: " + balance);
                }
                else {
                    return "you skipped your daily withdrawal Amount";
                }
            }
        }
    }



    public int getDailyAmount() {
        return dailyAmount;
    }

    // To print all the withdrawals transactions
    public void getWithdrawalTransactions(){
        for (Transactions t : transactionsArrayList){
            if(t.transactionType.equals("withdrawal")){
                System.out.println("Transaction type: " + t.transactionType);
                System.out.println("Transaction Amount: " + t.amount);
                System.out.println("Transaction Date: " + t.transactionDate);
                System.out.println("-------------------");
            }
        }
    }

    // To print all the deposit transactions
    public void getDepositTransactions(){
        for (Transactions t : transactionsArrayList){
            if(t.transactionType.equals("deposit")){
                System.out.println("Transaction type: " + t.transactionType);
                System.out.println("Transaction Amount: " + t.amount);
                System.out.println("Transaction Date: " + t.transactionDate);
            }
        }
    }

    // To change the account status
    public void changeStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }



}

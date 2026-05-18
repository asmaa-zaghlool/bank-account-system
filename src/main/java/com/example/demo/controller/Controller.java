package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Account;

@RestController
public class Controller {

    Account account = new Account();

    @PostMapping("/addNewAccount")
    public String addAccount(@RequestBody Account account){

        this.account.setAccountName(account.getAccountName());
        this.account.setAccountPassword(account.getAccountPassword());
        this.account.setBalance(account.getBalance());
        return "The user has been successfully added";
    }

    @GetMapping("/showAccountDetails")
    public Account getAccount() {
        return account;
    }


    @PostMapping("/deposit")
    public String deposit(@RequestBody int amount) {
        account.deposit(amount);
        return "Your account has been successfully deposited";
    }

    @PostMapping("/withdrew")
    public String withdraw(@RequestBody int amount) {
        return account.withdraw(amount);
    }

    @GetMapping("/showAccountBalance")
    public String getAccountBalance() {
        return ("Your balance is: " + account.getBalance());
    }


    @GetMapping("/withdrawTransactions")
    public String showWithdrawTransactions() {
        if(account.getStatus() == true) {
            return "The account is closed!";
        }

        account.getWithdrawalTransactions();
        return "Withdrawal transactions displayed successfully";
    }

    @GetMapping("/depositTransactions")
    public String showDepositTransactions() {
        if(account.getStatus() == true) {
            return "The account is closed!";
        }

        account.getDepositTransactions();
        return "Deposit transactions displayed successfully";
    }


    @PostMapping("activateOrCloseAccount")
    public String activatedAccountOrNot(@RequestParam boolean active ) {
        if (active==true) {
            account.changeStatus(active);
            return "Account is closed";
        }
        else{
            return "Account is activated";
        }
    }
}

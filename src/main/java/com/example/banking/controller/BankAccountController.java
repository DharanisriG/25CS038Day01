package com.example.banking.controller;

import com.example.banking.model.BankAccount;
import com.example.banking.service.BankAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/accounts")
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllAccounts();
    }

    @PostMapping("/accounts")
    public void addAccount(@RequestBody BankAccount account) {
        bankAccountService.addAccount(account);
    }

    @PutMapping("/accounts/{accountId}")
    public void replaceAccount(
            @PathVariable int accountId,
            @RequestBody BankAccount newAccount) {

        bankAccountService.replaceAccount(accountId, newAccount);
    }

    @DeleteMapping("/accounts/{accountId}")
    public void removeAccount(@PathVariable int accountId) {
        bankAccountService.removeAccount(accountId);
    }
}
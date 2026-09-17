package com.example.banking.service;

import com.example.banking.model.BankAccount;
import com.example.banking.repository.BankAccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }

    public void addAccount(BankAccount account) {
        bankAccountRepository.save(account);
    }

    public void replaceAccount(int accountId, BankAccount newAccount) {
        newAccount.setAccountId(accountId);
        bankAccountRepository.save(newAccount);
    }

    public void removeAccount(int accountId) {
        bankAccountRepository.deleteById(accountId);
    }
}
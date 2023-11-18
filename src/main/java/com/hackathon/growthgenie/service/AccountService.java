package com.hackathon.growthgenie.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hackathon.growthgenie.model.Account;
import com.hackathon.growthgenie.repository.AccountRepository;

@Service
public class AccountService {

  @Autowired
  private AccountRepository accountRepository;

  public List<Account> getAllAccounts() {
    return accountRepository.findAll();
  }


  public Account getAccountsById(String accountId) {
    return accountRepository.findById(accountId).get();
  }

  public List<Account> getAccountByCustomerId(Integer id) {
    List<Account> accounts = accountRepository.findByCustomerId(id);
    return accounts;
  }

  public Account addNewAccount(Account account) {
    return accountRepository.save(account);
  }


  public Account updateAccount(String accountId, Account account) {
    Account existingAccount = accountRepository.findById(accountId).get();
    existingAccount.setAccountBalance(account.getAccountBalance());
    existingAccount.setAccountStatus(account.getAccountStatus());
    existingAccount.setAccountType(account.getAccountType());
    existingAccount.setInterestRate(account.getInterestRate());
    existingAccount.setLastTransactionDate(new Date());
    Account updatedAccount = accountRepository.save(existingAccount);
    return updatedAccount;
  }


  public void deleteAccount(String accountId) {
    accountRepository.deleteById(accountId);
  }

}
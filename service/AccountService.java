package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDto account);
    String deposit(AccountDto account);
    String withdraw(AccountDto account);
    String getBalance(String accountNumber);
    String cancel(String accountNumber);
    List<AccountDto> getAccounts();

}

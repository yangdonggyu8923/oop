package serviceImpl;

import model.AccountDto;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    List<AccountDto> accounts;

    private AccountServiceImpl() {
        this.accounts = new ArrayList();
    }

    public static AccountService getInstance() {return instance;}


    @Override
    public String createAccount(AccountDto user) {
        return "";
    }

    @Override
    public String deposit(AccountDto account) {
        return "";
    }

    @Override
    public String withdraw(AccountDto account) {
        return "";
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancel(String accountNumber) {
        return "";
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}

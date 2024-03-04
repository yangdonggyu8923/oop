package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    List<Account> accounts;

    private AccountServiceImpl() {
        this.accounts = new ArrayList();
    }

    public static AccountService getInstance() {return instance;}


    @Override
    public String createAccount(Account user) {
        return "";
    }

    @Override
    public String deposit(Account account) {
        return "";
    }

    @Override
    public String withdraw(Account account) {
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
    public List<Account> getAccounts() {
        return null;
    }
}

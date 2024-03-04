package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        System.out.println("아이디, 계좌번호, 계좌주, 잔고, 금일날짜를 입력하세요.");
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextInt())
                .transactionDate(null)
                .build());
    }


    public String deposit(Scanner sc) {
        return accountService.deposit(Account.builder()
                .accountNumber(sc.next())
                .build());
    }


    public String withdraw(Scanner sc) {
        return accountService.withdraw(Account.builder().build());
    }


    public String getBalance(Scanner sc) {
        return accountService.getBalance(sc.next());
    }


    public String cancel(Scanner sc) {
        return accountService.cancel(sc.next());
    }

    public String getAccounts(Scanner sc) {
        return null;
    }
}

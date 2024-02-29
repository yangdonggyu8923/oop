package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        System.out.println("아이디, 계좌번호, 계좌주, 잔고, 금일날짜를 입력하세요.");
        return accountService.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextInt())
                .transactionDate(null)
                .build());
    }


    public String deposit(Scanner sc) {
        return accountService.deposit(new AccountBuilder()
                .accountNumber(sc.next())
                .build());
    }


    public String withdraw(Scanner sc) {
        return accountService.withdraw(new AccountBuilder().build());
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

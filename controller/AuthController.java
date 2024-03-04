package controller;


import model.User;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        auth = AuthServiceImpl.getInstance();
    }

    public String login(Scanner sc) {
        return auth.login(sc);
    }

    public String join(Scanner sc) {
        User.builder()
                .username(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .build();
        return auth.join(sc);
    }

    public String addUsers() {
        return auth.addUsers();
    }

    public User findUser(String username) {
        User user = auth.findUser(username);
        return user;
    }

    public Map<String, User> getUserMap() {
        return auth.getUserMap();
    }
    public String countUser(){
        System.out.println("회원수 : " + auth.countUser()+" 명");
        return auth.countUser();
    }
}

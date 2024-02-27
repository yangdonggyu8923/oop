package controller;

import model.PersonDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        auth = AuthServiceImpl.getInstance();
    }

    public String login() {
        return auth.login();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String addUsers() {
        return auth.addUsers();
    }

    public PersonDto findUser(String username) {
        PersonDto user = auth.findUser(username);
        return user;
    }

    public Map<String, PersonDto> getUserMap() {
        return auth.getUserMap();
    }
    public String count(){
        System.out.println("회원수 : " + auth.count()+" 명");
        return auth.count();
    }
}

package controller;

import model.PersonDto;
import service.UserSerivice;
import serviceImpl.UserServiceImpl;

import java.util.Map;
import java.util.Scanner;

public  class UserController{
    UserSerivice user;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public String login(){return user.login();}
    public String join(Scanner sc){return user.join(sc);}
    public String addUsers(){
        return user.addUsers();
    }

    public PersonDto findUser(String username){
        PersonDto findUser = user.findUser(username);
        return findUser;
    }

    public  Map<String, PersonDto> getUserMap(){
        return user.getUserMap();
    }

    public String count(){
        return "회원수 : " + user.count()+ " 명";
    }
}
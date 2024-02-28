package controller;

import builder.PersonBuilder;
import model.PersonDto;
import service.UserSerivice;
import serviceImpl.UserServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserSerivice userSerivice;

    public UserController() {
        this.userSerivice = UserServiceImpl.getInstance();
    }

    public String login(Scanner sc) {
        System.out.println("ID, 비밀번호를 입력하세요.");

        return userSerivice.login(new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업을 입력하세요");
        return userSerivice.join(new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .build());
    }

    public String addUsers() {
        return userSerivice.addUsers();
    }

    public String findUserById(Scanner sc){
        System.out.println("아이디를 입력하세요.");
        return userSerivice.findUserById(new PersonBuilder()
                .username(sc.next())
                .build());
    }
    public  String changePassword(Scanner sc){
        System.out.println("아이디와 변경할 비밀번호를 입력하세요.");
        return userSerivice.changePassword(new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }
    public PersonDto findUser(String username) {
        PersonDto findUser = userSerivice.findUser(username);
        return findUser;
    }

    public Map<String, PersonDto> getUserMap() {
        return userSerivice.getUserMap();
    }
    public String secessionUser(Scanner sc){
        System.out.println("탈퇴할 계정의 아이디와 비밀번호를 입력하세요.");
        return userSerivice.secessionUser(new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String count() {
        return "회원수 : " + userSerivice.count() + " 명";
    }
}
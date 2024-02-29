package controller;

import builder.UserBuilder;
import model.UserDto;
import service.UserSerivice;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserSerivice userSerivice;

    public UserController() {
        this.userSerivice = UserServiceImpl.getInstance();
    }

    public String login(Scanner sc) {
        System.out.println("ID, 비밀번호를 입력하세요.");

        return userSerivice.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업을 입력하세요");
        return userSerivice.join(new UserBuilder()
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
        return userSerivice.findUserById(new UserBuilder()
                .username(sc.next())
                .build());
    }
    public  String changePassword(Scanner sc){
        System.out.println("아이디와 변경할 비밀번호를 입력하세요.");
        return userSerivice.changePassword(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }
    public List<UserDto> findUserByName(Scanner sc) {
        System.out.println("이름을 입력하세요.");
        return userSerivice.findUserByName(new UserBuilder()
                .name(sc.next())
                .build());
    }
    public List<UserDto> findUserByJob(Scanner sc) {
        System.out.println("직업을 입력하세요.");
        return userSerivice.findUserByName(new UserBuilder()
                .job(sc.next())
                .build());
    }

    public Map<String, UserDto> getUserMap() {
        return userSerivice.getUserMap();
    }
    public String secessionUser(Scanner sc){
        System.out.println("탈퇴할 계정의 아이디와 비밀번호를 입력하세요.");
        return userSerivice.secessionUser(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String count() {
        return "회원수 : " + userSerivice.count() + " 명";
    }
}
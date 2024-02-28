package serviceImpl;

import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.UtilService;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, PersonDto> users;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String login(Scanner sc) {
        return "";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업, 무게, 키를 입력하세요");
        PersonDto person = new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .weight(0.0)
                .height(0.0)
                .build()
                ;
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, PersonDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new PersonBuilder()
                    .username(username)
                    .password("1")
                    .checkPassword("1")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public PersonDto findUser(String username) {
        PersonDto user = new PersonBuilder().build();
        return user;
    }

    @Override
    public PersonDto findUserById(Scanner sc) {
        return null;
    }

    @Override
    public Map<String, PersonDto> getUserMap() {
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users; // map을 컨트롤러로 보냄
    }

    @Override
    public String countUser() {
        return users.size()+"";
    }

}


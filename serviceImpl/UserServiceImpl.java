package serviceImpl;

import builder.PersonBuilder;
import model.PersonDto;
import service.UserSerivice;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserSerivice {
    private static UserSerivice instance = new UserServiceImpl();
    Map<String, PersonDto> users2;

    public UserServiceImpl() {
        this.users2 = new HashMap<>();
    }
    public static UserSerivice getInstance(){return instance;}

    @Override
    public String login() {
        return "";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업을 입력하세요");
        PersonDto person = new PersonBuilder()
                .username(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .build();
        String result = ("ID : " +person.getUsername()+
                "\n비밀번호 : "+person.getPassword()+
                "\n비밀번호확인 : "+person.getCheckPassword()+
                "\n이름 : "+person.getName()+
                "\n주민번호 : "+person.getResidentRegistrationNumber()+
                "\n전화번호 : "+person.getPhoneNumber()+
                "\n주소 : "+person.getAddress()+
                "\n직업 : "+person.getJob());
        return result;
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
        users2 = map;
        return "";
    }

    @Override
    public PersonDto findUser(String username) {
        PersonDto user = new PersonBuilder().build();
        return user;
    }

    @Override
    public Map<String, PersonDto> getUserMap() {
        users2.forEach((k,v)-> System.out.println("{"+k+','+v+"}"));
        return users2; // map 컨트롤러로 전송
    }

    @Override
    public String count() {
        return users2.size()+""; // 회원수
    }
}
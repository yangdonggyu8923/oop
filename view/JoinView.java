package view;

import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업, 무게, 키를 입력하세요");
        AuthService auth = AuthServiceImpl.getInstance();
        PersonDto person = new PersonBuilder()
                .id(sc.next())
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

        System.out.println(person.toString());

    }
}

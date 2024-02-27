package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController ctrl = new UserController();
        ctrl.addUsers();
        while(true){
            System.out.println("[메뉴]\n" +
                    "0-종료\n" +
                    "1-회원가입\n" +
                    "2-로그인\n" +
                    "3-ID검색\n" +
                    "4-비번변경\n" +
                    "5-탈퇴\n" +
                    "6-회원목록\n" +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("====회원가입====");
                    System.out.println(ctrl.join(sc));
                    break;
                case "2":
                    System.out.println("====로그인====");
                    break;
                case "3":
                    System.out.println("====ID검색====");
                    break;
                case "4":
                    System.out.println("====비번변경====");
                    break;
                case "5":
                    System.out.println("====탈퇴====");
                    break;
                case "6":
                    System.out.println("====회원목록====");
                    System.out.println(ctrl.getUserMap());
                    break;
                case "7":
                    System.out.println("====이름검색====");
                    break;
                case "8":
                    System.out.println("====직업검색====");
                    break;
                case "9":
                    System.out.println("====회원수====");
                    System.out.println(ctrl.count());
                    break;
            }
        }

    }
}

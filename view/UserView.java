package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController userController = new UserController();
        String msg = userController.addUsers();
        System.out.println("userController.addUsers() 결과 : " + msg);
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
                    System.out.println(userController.join(sc));
                    break;
                case "2":
                    System.out.println("====로그인====");
                    System.out.println(userController.login(sc));
                    break;
                case "3":
                    System.out.println("====ID검색====");
                    System.out.println(userController.findUserById(sc));
                    break;
                case "4":
                    System.out.println("====비번변경====");
                    System.out.println(userController.changePassword(sc));
                    break;
                case "5":
                    System.out.println("====탈퇴====");
                    System.out.println(userController.secessionUser(sc));
                    break;
                case "6":
                    System.out.println("====회원목록====");
                    userController.getUserMap();
                    break;
                case "7":
                    System.out.println("====이름검색====");
                    userController.findUserByName(sc).forEach((i)->{
                        System.out.println(i);});
                    break;
                case "8":
                    System.out.println("====직업검색====");
                    userController.findUserByJob(sc);
                    break;
                case "9":
                    System.out.println("====회원수====");
                    System.out.println(userController.count());
                    break;
            }
        }

    }
}

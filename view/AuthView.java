package view;

import controller.AuthController;


import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc) {
        AuthController authController = new AuthController();
        authController.addUsers();
        while(true){
            System.out.println("[메뉴] 0-종료\n" +
                    "1-ID검색\n " +
                    "2-회원목록\n " +
                    "3-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "3":
                    System.out.println("=== 회원수 ===");
                    authController.countUser();
                    break;
                case "2":
                    System.out.println("=== 회원목록 ===");
                    authController.getUserMap();
                    break;

            }

        }

    }
}
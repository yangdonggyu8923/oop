package service;

import model.User;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login(Scanner sc);
    String join(Scanner sc);
    String addUsers();
    User findUser(String username);
    User findUserById(Scanner sc);
    Map<String, User> getUserMap();
    String countUser();
}

package service;

import model.UserDto;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login(Scanner sc);
    String join(Scanner sc);
    String addUsers();
    UserDto findUser(String username);
    UserDto findUserById(Scanner sc);
    Map<String, UserDto> getUserMap();
    String countUser();
}

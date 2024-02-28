package service;

import builder.PersonBuilder;
import model.PersonDto;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login(Scanner sc);
    String join(Scanner sc);
    String addUsers();
    PersonDto findUser(String username);
    PersonDto findUserById(Scanner sc);
    Map<String, PersonDto> getUserMap();
    String countUser();
}

package service;

import builder.PersonBuilder;
import model.PersonDto;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login();
    String join(Scanner sc);
    String addUsers();
    PersonDto findUser(String username);
    Map<String, PersonDto> getUserMap();
    String count();
}

package service;

import model.PersonDto;

import java.util.Map;
import java.util.Scanner;

public interface UserSerivice {
    String login();
    String join(Scanner sc);
    String addUsers();
    PersonDto findUser(String username);
    Map<String, PersonDto> getUserMap();
    String count();

}

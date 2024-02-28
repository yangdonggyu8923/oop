package service;

import model.PersonDto;

import java.util.Map;
import java.util.Scanner;

public interface UserSerivice {
    String login(PersonDto user);
    String join(PersonDto user);
    String addUsers();
    String findUserById(PersonDto user);
    String changePassword(PersonDto user);
    String secessionUser(PersonDto user);
    PersonDto findUser(String username);
    Map<String, PersonDto> getUserMap();
    String count();

}

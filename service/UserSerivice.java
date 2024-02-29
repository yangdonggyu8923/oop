package service;

import model.UserDto;

import java.util.List;
import java.util.Map;

public interface UserSerivice {
    String login(UserDto user);
    String join(UserDto user);
    String addUsers();
    String findUserById(UserDto user);
    String changePassword(UserDto user);
    String secessionUser(UserDto user);
    List<UserDto> findUserByName(UserDto user);
    List<UserDto> findUserByJob(UserDto user);
    List<UserDto> getUserList();
    Map<String, UserDto> getUserMap();
    String count();

}

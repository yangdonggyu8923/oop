package service;

import model.User;

import java.util.List;
import java.util.Map;

public interface UserSerivice {
    String login(User user);
    String join(User user);
    String addUsers();
    String findUserById(User user);
    String changePassword(User user);
    String secessionUser(User user);
    List<?> findUserByName(User user);
    List<?> findUserByJob(User user);
    List<?> getUserList();
    Map<String, ?> getUserMap();
    String count();

}

package serviceImpl;

import model.User;
import service.UserSerivice;
import service.UtilService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserSerivice {
    private static UserSerivice instance = new UserServiceImpl();
    Map<String, User> users;
    List<User> usersList;

    public UserServiceImpl() {
        this.users = new HashMap<>();
        this.usersList = new ArrayList<>();
    }

    public static UserSerivice getInstance() {
        return instance;
    }

    @Override
    public String login(User user) {
        User userInMap = users.get(user.getUsername());
        String msg = "";
        if (userInMap == null){
            msg = "유효하지 않은 아이디입니다.";
        }else{
            if (userInMap.getPassword().equals(user.getPassword())){
                msg = "로그인 완료";
            }
            else{msg ="유효하지 않은 비밀번호입니다.";}}

        return msg;
    }

    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 완료";
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, User.builder()
                    .username(username)
                    .password("1")
                    .checkPassword("1")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return users.size() + " 개 더미값 추가";
    }

    @Override
    public String findUserById(User user) {
        User userInMap = users.get(user.getUsername());
        String msg = "";
        if(userInMap == null){
            msg = "존재하지 않는 아이디 입니다.";
        }
        else{
            System.out.println(userInMap);}
        return msg;
    }

    @Override
    public String changePassword(User user) {
//        users.get(user.getUsername()).setPassword();
        User userInMap = users.get(user.getUsername());
        String msg = "";
        if (userInMap != null){
            msg = "아이디 동일, 비밀번호 변경완료";
            userInMap.setPassword(user.getPassword());
        }else {
            msg = "아이디 불일치";
        }
        return msg;
    }

    @Override
    public String secessionUser(User user) {
        User userInMap = users.get(user.getUsername());
        String msg = "";
        if (userInMap != null){
            if(userInMap.getPassword().equals(user.getPassword())){
            msg = "아이디, 비밀번호 동일, 탈퇴완료";
            users.remove(user.getUsername());
        }}
        else {msg = "아이디 불일치";}

        return msg;
    }

    @Override
    public List<User> findUserByName(User user) {
        User userInMap = users.get(user.getName());
        String msg = "";
        if (userInMap != null){
            msg = "해당 이름을 가진 사람";
            userInMap.toString();
        }
        else{msg = "해당 이름을 가진 사람 없음";}
        return null;
    }

    @Override
    public List<User> findUserByJob(User user) {
        User userInList = users.get(user.getJob());
        String msg = "";
        if(userInList != null){
            msg = "해당 직업을 가진 사람";
            userInList.toString();
        }
        else{msg = "해당 직업을 가진 사람 없음";}
        return null;
    }

    @Override
    public List<User> getUserList() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Map<String, User> getUserMap() {
        users.forEach((k, v) -> System.out.println("{" + k + ',' + v + "}"));
        return users;
    }

    @Override
    public String count() {
        return users.size() + "";
    }
}
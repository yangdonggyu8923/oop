package serviceImpl;

import builder.PersonBuilder;
import model.PersonDto;
import service.UserSerivice;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserSerivice {
    private static UserSerivice instance = new UserServiceImpl();
    Map<String, PersonDto> users;

    public UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserSerivice getInstance() {
        return instance;
    }

    @Override
    public String login(PersonDto user) {
        PersonDto userInMap = users.get(user.getUsername());
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
    public String join(PersonDto user) {
        users.put(user.getUsername(), user);
        return "회원가입 완료";
    }

    @Override
    public String addUsers() {
        Map<String, PersonDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new PersonBuilder()
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
    public String findUserById(PersonDto user) {
        PersonDto userInMap = users.get(user.getUsername());
        String msg = "";
        if(userInMap == null){
            msg = "존재하지 않는 아이디 입니다.";
        }
        else{
            System.out.println(userInMap);}
        return msg;
    }

    @Override
    public String changePassword(PersonDto user) {
        PersonDto userInMap = users.get(user.getUsername());
        String msg = "";
        if (userInMap != null){
            msg ="아이디 동일, 비밀번호 변경완료";
            userInMap.setPassword(user.getPassword());
        }else {
            msg ="아이디 불일치";
        }
        return msg;
    }

    @Override
    public String secessionUser(PersonDto user) {
        PersonDto userInMap = users.get(user.getUsername());
        String msg = ""; // 비밀번호도 같이 입력하게 바꿔야함
        if (userInMap != null){
            if(userInMap.getPassword().equals(user.getPassword())){
            msg = "아이디, 비밀번호 동일, 탈퇴완료";
            users.remove(user.getUsername());
        }}
        else {msg = "아이디 불일치";}

        return msg;
    }

    @Override
    public PersonDto findUser(String username) {
        PersonDto user = new PersonBuilder()
                .build();
        return user;
    }

    @Override
    public Map<String, PersonDto> getUserMap() {
        users.forEach((k, v) -> System.out.println("{" + k + ',' + v + "}"));
        return users; // map 컨트롤러로 전송
    }

    @Override
    public String count() {
        return users.size() + ""; // + "" 하면 String이 된다.
    }
}
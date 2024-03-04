package serviceImpl;


import model.User;
import service.AuthService;
import service.UtilService;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, User> users;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String login(Scanner sc) {
        return "";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업, 무게, 키를 입력하세요");
        User person = User.builder()
                .username(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .weight(0.0)
                .height(0.0)
                .build()
                ;
        return null;
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
        return "더미값 추가";
    }

    @Override
    public User findUser(String username) {
        User user = User.builder().build();
        return user;
    }

    @Override
    public User findUserById(Scanner sc) {
        return null;
    }

    @Override
    public Map<String, User> getUserMap() {
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users; // map을 컨트롤러로 보냄
    }

    @Override
    public String countUser() {
        return users.size()+"";
    }

}


package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {
    private String username;
    private String password;
    private String checkPassword;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;
    @Builder(builderMethodName = "builder")
    public User(String username, String password, String checkPassword, String name, int residentRegistrationNumber, int phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

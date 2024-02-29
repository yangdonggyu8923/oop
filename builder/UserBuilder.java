package builder;

import model.UserDto;

public class UserBuilder {
    private String username;
    private String password;
    private String checkPassword;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;
    private double weight;
    private double height;

    public UserBuilder username(String username){
        this.username = username;
        return this;
    }
    public UserBuilder password(String password){
        this.password = password;
        return this;
    }
    public UserBuilder checkPassword(String checkPassword){
        this.checkPassword = checkPassword;
        return this;
    }
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }

    public UserBuilder residentRegistrationNumber(int residentRegistrationNumber){
        this.residentRegistrationNumber = residentRegistrationNumber;
        return this;
    }
    public UserBuilder phoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public UserBuilder job(String job){
        this.job = job;
        return this;
    }
    public UserBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }
    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }

        public UserDto build(){
        return new UserDto(username, password, checkPassword, name,
                residentRegistrationNumber, phoneNumber, address, job, weight, height);
    }

}

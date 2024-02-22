package builder;

import model.PersonDto;

public class PersonBuilder {
    private String id;
    private String password;
    private String checkPassword;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;
    private double weight;
    private double height;

    public PersonBuilder id(String id){
        this.id = id;
        return this;
    }
    public PersonBuilder password(String password){
        this.password = password;
        return this;
    }
    public PersonBuilder checkPassword(String checkPassword){
        this.checkPassword = checkPassword;
        return this;
    }
    public PersonBuilder name(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder residentRegistrationNumber(int residentRegistrationNumber){
        this.residentRegistrationNumber = residentRegistrationNumber;
        return this;
    }
    public PersonBuilder phoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public PersonBuilder address(String address){
        this.address = address;
        return this;
    }
    public  PersonBuilder job(String job){
        this.job = job;
        return this;
    }
    public  PersonBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }
    public  PersonBuilder height(double height) {
        this.height = height;
        return this;
    }

        public PersonDto build(){
        return new PersonDto(id, password, checkPassword, name,
                residentRegistrationNumber, phoneNumber, address, job, weight, height);
    }

}

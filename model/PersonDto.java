package model;

public class PersonDto {
    private String id;
    private String password;
    private String checkPassword;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;

    private double height;
    private double weight;


    public PersonDto(String id, String password, String checkPassword, String name, int residentRegistrationNumber, int phoneNumber, String address, String job, double height, double weight) {

        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckPassword() {
        return checkPassword;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResidentRegistrationNumber() {
        return residentRegistrationNumber;
    }

    public void setResidentRegistrationNumber(int residentRegistrationNumber) {
        this.residentRegistrationNumber = residentRegistrationNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", checkPassword='" + checkPassword + '\'' +
                ", name='" + name + '\'' +
                ", residentRegistrationNumber=" + residentRegistrationNumber +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

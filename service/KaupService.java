package service;

import model.UserDto;

public interface KaupService {
    public String createBmi(UserDto user);
    public String createBodyMass(String bmi);
}

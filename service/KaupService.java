package service;

import model.User;

public interface KaupService {
    public String createBmi(User user);
    public String createBodyMass(String bmi);
}

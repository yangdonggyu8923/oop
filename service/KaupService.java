package service;

import model.PersonDto;

public interface KaupService {
    public String createBmi(PersonDto user);
    public String createBodyMass(String bmi);
}

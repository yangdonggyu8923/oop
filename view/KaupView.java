package view;

import builder.PersonBuilder;
import model.PersonDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        PersonDto person = new PersonBuilder()
                .height(util.createRandomDouble(150,50))
                .weight(util.createRandomDouble(30,100))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBmi(person);
        String bodyMass = kaup.createBodyMass(bmi);

        System.out.printf("======== BMI 계산기 ========\n" +
                "BMI : %s\n" +
                "체질량 : %s\n" +
                "================",
                bmi,bodyMass);
    }
}

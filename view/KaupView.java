package view;

import builder.PersonBuilder;
import model.PersonDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        PersonDto person = new PersonBuilder()
                .height(util.createdRandomDouble(150,50))
                .weight(util.createdRandomDouble(30,100))
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

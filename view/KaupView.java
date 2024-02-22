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
        double h = util.createdRandomDouble(150,50);
        double w = util.createdRandomDouble(30,100);
        PersonDto person = new PersonBuilder()
                .height(h)
                .weight(w)
                .build();

        System.out.printf("키 : %.1f mm, 몸무게 : %.1f",person.getHeight(), person.getWeight());

        KaupService service = KaupServiceImpl.getInstance();
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.println("======== BMI 계산기 ========");
        System.out.println("신장 : " + person.getHeight());
        System.out.println("체중 : " + person.getWeight());
        System.out.printf("BMI : %.1f", bmi);
        System.out.println();
        System.out.println("체질량 : " + bodyMass);
        System.out.println("===========================");
    }
}

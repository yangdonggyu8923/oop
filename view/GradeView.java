package view;


import model.User;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {

        System.out.println("이름을 입력하세요.");


        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        User student = User.builder()
                            .name(sc.next())
                            .build();
        Subject subjects = Subject.builder()
                            .korean(util.createRandomInteger(0,100))
                            .math(util.createRandomInteger(0,100))
                            .english(util.createRandomInteger(0,100))
                            .build();

        int totalScore = Integer.parseInt(grade.getTotalScore(subjects));
        double avg = Double.parseDouble(grade.findAverage(totalScore));

        System.out.printf("==== 성적표 ====\n" +
                "이름 : %s\n" +
                "국어 : %d\n" +
                "영어 : %d\n" +
                "수학 : %d\n" +
                "총합 : %d\n" +
                "평균 : %.1f\n" +
                "==========",
                student.getName(),
                subjects.getKorean(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore,avg);
    }
}

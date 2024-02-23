package view;

import builder.PersonBuilder;
import builder.SubjectBuilder;
import model.PersonDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {

        System.out.println("이름을 입력하세요.");

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        PersonDto student = new PersonBuilder()
                            .name(sc.next())
                            .build();
        SubjectDto subjects = new SubjectBuilder()
                            .korean(util.createdRandomInteger(0,100))
                            .math(util.createdRandomInteger(0,100))
                            .english(util.createdRandomInteger(0,100))
                            .build();

        int totalScore = grade.getTotalScore(subjects);
        double avg = grade.findAverage(totalScore);

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

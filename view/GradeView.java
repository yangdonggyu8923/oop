package view;

import builder.SubjectBuilder;
import model.SubjectDto;
import service.GradeService;
import serviceImpl.GradeServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        GradeService subject = GradeServiceImpl.getInstance();
        SubjectDto grade = new SubjectBuilder()
                .korean(sc.nextInt())
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build();
        System.out.println(grade.toString());
    }
}

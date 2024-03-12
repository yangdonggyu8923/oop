package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

enum DayWeek{
    SUNDAY("sunday", ()-> "일요일"),
    MONDAY("monday", ()-> "월요일"),
    TUESDAY("tuesday", ()-> "화요일"),
    WEDNESDAY("wednesday", ()-> "수요일"),
    THURSDAY("thursday", ()-> "목요일"),
    FRIDAY("sunday", ()-> "일요일"),
    SATURDAY("sunday", ()-> "일요일");
    private final String week;
    private final Supplier<String> supplier;

    DayWeek(String week, Supplier<String> supplier) {
        this.week = week;
        this.supplier = supplier;
    }

    public static String getKoreanDay(String week){
        return getOperator(week).supplier.get();
    }
    private static DayWeek getOperator(String day){
        return Arrays.stream(values())
                .filter(o->o.week.equals(day))
                .findFirst().orElseThrow(()->new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}
public class WhatDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 입력하세요");
        System.out.println(DayWeek.getKoreanDay("sunday"));
    }


}

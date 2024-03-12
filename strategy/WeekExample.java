package strategy;

import java.util.Scanner;

enum Week{
   monday{
       @Override
       public String get(){
           return "월요일";
       }
   },
    tuesday{
        @Override
        public String get(){
            return "화요일";
        }
    },
    wednesday{
        @Override
        public String get(){
            return "수요일";
        }
    },
    thursday{
        @Override
        public String get(){
            return "목요일";
        }
    },
    friday{
        @Override
        public String get(){
            return "금요일";
        }
    },
    saturday{
        @Override
        public String get(){
            return "토요일";
        }
    },
    sunday{
        @Override
        public String get(){
            return "일요일";
        }
    };
    public abstract String get();

}
public class WeekExample {
    public static String weekExample(Week week){
        return week.get();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 영어로 입력하세요");
        System.out.println(WeekExample.weekExample(Week.valueOf(sc.next())));
    }
}

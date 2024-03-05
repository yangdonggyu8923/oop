package service;

import model.Subject;

public interface GradeService {
    String getTotalScore(Subject subjects);
    String findAverage(int totalScore);

}

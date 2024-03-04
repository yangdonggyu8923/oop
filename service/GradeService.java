package service;

import model.Subject;

public interface GradeService {
    public int getTotalScore(Subject subjects);
    public double findAverage(int totalScore);

}

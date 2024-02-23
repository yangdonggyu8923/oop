package service;

import model.SubjectDto;

public interface GradeService {
    public int getTotalScore(SubjectDto subjects);
    public double findAverage(int totalScore);

}

package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}

    public static UtilService getInstance(){
        return instance;
    }

    @Override
    public int createdRandomInteger(int start, int gapBetweenStartAndEnd) {
        int a = start + (int)(Math.random() * gapBetweenStartAndEnd);
        return a;
    }

    @Override
    public double createdRandomDouble(double start, double gapBetweenStartAndEnd) {
        return Double.parseDouble
                (String.format("%.1f",
                        start + (int)(Math.random() * gapBetweenStartAndEnd)));
    }
}

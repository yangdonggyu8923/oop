package serviceImpl;

import model.PersonDto;
import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}

    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBmi(PersonDto user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = Math.round(weight/((height/100)*(height/100)))/10;
        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double doubleBmi = Double.parseDouble(bmi);
        String bodyMass = "";
        if (doubleBmi < 18.5){
            bodyMass = "저체중";
        }
        else if (doubleBmi < 23){
            bodyMass = "정상";
        }
        else if (doubleBmi < 25){
            bodyMass = "과체중";
        }
        else{
            bodyMass = "비만";
        }
        return bodyMass;
    }
}

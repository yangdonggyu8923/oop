package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    Map<String, ?> usersMap;
    List<?> usersList;
    private KaupServiceImpl(){
        this.usersMap = new HashMap<>();
        this.usersList = new ArrayList<>();
    }
    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBmi(User user) {
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

package homework.hw3.opp;

import java.util.ArrayList;
import java.util.List;

public class Wheels {

    private String wheelType;

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    private Wheels (String wheelType){
        this.wheelType = wheelType;
    }

    public Wheels (){};

    public List<Wheels> getWheelsList(String wheelType, int wheelsNum){
        List<Wheels> wheelsList = new ArrayList<Wheels>();
        for (int i = 0; i < wheelsNum; i++) {
            wheelsList.add(new Wheels(wheelType));
        }
        return wheelsList;
    }

    public void turnWheel(){
        System.out.println("Wheel is turning.");
    }

    public void stopWheel() {
        System.out.println("Wheel is stopped.");
    }
}

package homework.hw3.opp;

import java.util.List;

public class SportCar extends Car{
    public SportCarDriver getDriver() {
        return driver;
    }

    public void setDriver(SportCarDriver driver) {
        this.driver = driver;
    }

    private SportCarDriver driver;

    public SportCar(Engine engine, List<Wheels> wheels) {
        super(engine, wheels);
    }

    //@Override
    public void startCar(){
        driver.putKey();
        driver.turnKey();
        engine.putGas();
        engine.burnGas();
        for (Wheels w :wheels){
            w.turnWheel();
        }
    }

    public void stopCar(){
        driver.pushBrake();
        for (Wheels w :wheels){
            w.stopWheel();
        }
        driver.turnKey();
    }
}

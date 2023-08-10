package homework.hw3.opp;

import java.util.List;

public abstract class Car {

    protected List<Wheels> wheels;
    protected Engine engine;
    protected String color;

    public Car(Engine engine, List<Wheels> wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public void startCar(Driver driver){
        driver.putKey();
        driver.turnKey();
        engine.putGas();
        engine.burnGas();
        for (Wheels w :wheels){
            w.turnWheel();
        }
    }

   // public abstract void startCar();

    public void stopCar(Driver driver){
        driver.pushBrake();
        for (Wheels w :wheels){
            w.stopWheel();
        }
        driver.turnKey();
    }

}

package homework.hw3.opp;

import java.util.List;

public class Lorry extends Car {

    private String modelName;

    private LorryDriver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(LorryDriver driver) {
        this.driver = driver;
    }

    public Lorry(Engine engine, List<Wheels> wheels){
        super(engine, wheels);
    }

    public void startCar(){
        driver.putKey();
        driver.turnKey();
        engine.putGas();
        engine.burnGas();
        for (Wheels w :wheels){
            w.turnWheel();
        }
    }

    public List<Wheels> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheels> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", modelName='" + modelName + '\'' +
                ", driver=" + driver +
                '}';
    }
}

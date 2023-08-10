package homework.hw3.opp;

public class Main {

    public static void main(String[] args) {
        Lorry testCar = new Lorry(new Engine("v8"), new Wheels().getWheelsList("TestWheel", 4));
        testCar.setDriver(new LorryDriver("testDriver", 4));
        testCar.startCar();
        testCar.stopCar(testCar.getDriver());

        SportCar sportCar = new SportCar(new Engine("sport car engine"),
                new Wheels().getWheelsList("SportCarwheel", 4));
        sportCar.setDriver(new SportCarDriver("SportCerDriver", 6));
        sportCar.startCar();
        sportCar.stopCar();

        Car car = new PassengerСar(new Engine("v8"), new Wheels().getWheelsList("AllSeason", 4));
    }
}

package homework.hw3.opp;

public class Engine {

    private String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void burnGas(){
        System.out.println("Gas is burning.");
    }

    public void putGas(){
        System.out.println("Gas was putted to engine.");
    }
}

package homework.hw3.opp;

public abstract class Driver {

    protected String driverType;
    protected int yearsExp;
    protected String licenseNumber;

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }

    public Driver(String driverType, int yearsExp){
        this.driverType = driverType;
        this.yearsExp = yearsExp;
    }

    public static void putKey(){
        System.out.println("Driver is putted the key.");
    }

    public void turnKey(){
        System.out.println("Driver is turned the key.");
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverType='" + driverType + '\'' +
                ", yearsExp=" + yearsExp +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }

    public void pushBrake() {
        System.out.println("Driver pushed the brake.");
    }
}

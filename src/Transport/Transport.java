package Transport;

public abstract class Transport implements DriverBehavior {
    private final String brand;
    private final String model;
    private final float engineValue;
    private DriverWithCategory driverWithCategory;
    private Mechanic mechanic;

    public Transport(String brand,
                     String model,
                     float engineValue,
                     DriverWithCategory driverWithCategory,
                     Mechanic mechanic) {
        this.brand = validateString(brand, "Default");
        this.model = validateString(model, "Default");
        this.engineValue = validateFloat(engineValue);
        this.driverWithCategory = driverWithCategory;
        this.mechanic = mechanic;
    }

    public boolean isNeedDiagnostic() {
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineValue() {
        return engineValue;
    }

    public void setDriverWithCategory(DriverWithCategory driverWithCategory) {
        this.driverWithCategory = driverWithCategory;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    @Override
    public String toString() {
        return "brand=" + brand + '\'' +
                ", model=" + model + '\'' +
                ", engineValue=" + engineValue;
    }

    public String validateString(String validateString, String defaultValue) {
        return validateString == null || validateString.isEmpty() || validateString.isBlank() ? defaultValue : validateString;
    }

    public Integer validateInt(Integer validateInt) {
        return validateInt == null || validateInt < 0 ? 0 : validateInt;
    }

    public Float validateFloat(Float validateFloat) {
        return validateFloat == null || validateFloat < 0 ? 0 : validateFloat;
    }

    public void start() {
        System.out.println(getBrand() + " Start moving");
    }

    public void stop() {
        System.out.println(getBrand() + " Stop moving");
    }
}
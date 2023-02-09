package Transport;

public abstract class Transport implements DriverBehavior {
    private final String brand;
    private final String model;
    private final float engineValue;
    private String needCategory;
    private Mechanic mechanic;

    public Transport(String brand,
                     String model,
                     float engineValue,
                     String needCategory) {
        this.brand = validateString(brand, "Default");
        this.model = validateString(model, "Default");
        this.engineValue = validateFloat(engineValue);
        this.needCategory = validateString(needCategory, "No");
        this.mechanic = AutoService.getNextMechanic();
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

    public String getNeedCategory() {
        return needCategory;
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
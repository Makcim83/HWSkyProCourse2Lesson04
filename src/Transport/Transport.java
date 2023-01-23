package Transport;


public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineValue;

    public Transport(String brand,
                     String model,
                     float engineValue) {
        this.brand = validateString(brand, "Default");
        this.model = validateString(model, "Default");
        this.engineValue = validateFloat(engineValue);
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

    public void startMove() {
        System.out.println(this.getBrand() + " Start moving");
    }

    public void stopMove() {
        System.out.println(this.getBrand() + " Stop moving");
    }

    public static void startTheRace(Transport[] arr) {
        for (Transport tr : arr
        ) {
            tr.startMove();

        }
    }

}

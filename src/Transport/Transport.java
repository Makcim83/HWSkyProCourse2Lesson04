package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maximalSpeed;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maximalSpeed) {
        setBrand(brand);
        setModel(model);
        this.year = validateInt(year);
        this.country = validateString(country, "default");
        setColor(color);
        setMaximalSpeed(maximalSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateString(brand, "default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateString(model, "default");
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateString(color, "default");
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public void setMaximalSpeed(int maximalSpeed) {
        this.maximalSpeed = validateInt(maximalSpeed);
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maximalSpeed=" + maximalSpeed;
    }

    public String validateString(String validateString, String defaultValue) {
        return validateString == null || validateString.isEmpty() || validateString.isBlank() ? defaultValue : validateString;
    }

    public Integer validateInt(Integer validateInt) {
        return validateInt == null || validateInt < 0 ? 0 : validateInt;
    }

}

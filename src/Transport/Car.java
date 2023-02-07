package Transport;

public class Car extends Transport {

    public DriverWitCategory driverBCategory = new DriverWitCategory(getNeedCategory());

    public Car(String brand,
               String model,
               float engineValue,
               String needCategory) {
        super(brand,
                model,
                engineValue,
                needCategory);
    }

    @Override
    public boolean isNeedDiagnostic() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void start() {
        driverBCategory.start();
        System.out.println(getBrand());
    }

    @Override
    public void stop() {
        driverBCategory.stop();
        System.out.println(getBrand());
    }
}
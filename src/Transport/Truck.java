package Transport;

public class Truck extends Transport {

    public DriverWitCategory driverWitCategory = new DriverWitCategory(getNeedCategory());

    public Truck(String brand,
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
        driverWitCategory.start();
        System.out.println(getBrand());
    }

    @Override
    public void stop() {
        driverWitCategory.start();
        System.out.println(getBrand());
    }
}

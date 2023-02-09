package Transport;

public class Truck extends Transport {

    public DriverWithCategory driverWitCategory = new DriverWithCategory(getNeedCategory());

    public Truck(String brand,
                 String model,
                 float engineValue,
                 String needCategory,
                 Mechanic mechanic) {
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

package Transport;

public class Truck extends Transport {

    public Truck(String brand,
                 String model,
                 float engineValue,
                 DriverWithCategory driverWithCategory,
                 Mechanic mechanic) {
        super(brand,
                model,
                engineValue,
                driverWithCategory,
                mechanic);
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
        System.out.println("Start Truck");
    }

    @Override
    public void stop() {
        System.out.println("Stop Truck");
    }
}

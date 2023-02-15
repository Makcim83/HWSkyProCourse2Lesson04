package Transport;

public class Car extends Transport {

    public Car(String brand,
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
        System.out.println("Start Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Car");
    }
}
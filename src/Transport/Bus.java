package Transport;

public class Bus extends Transport {
    DriverWithCategory driverWitCategory = new DriverWithCategory("David", "D");

    public Bus(String brand,
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
        try {

        } catch (Exception e) {
            throw e;
        } finally {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void start() {
        System.out.println("Start Bus");
    }

    @Override
    public void stop() {
        System.out.println("Stop Bus");
    }
}

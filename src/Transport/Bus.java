package Transport;

public class Bus extends Transport {
    DriverWithCategory driverWitCategory = new DriverWithCategory("D");

    public Bus(String brand,
               String model,
               float engineValue,
               String needCategory,
               Mechanic mechanic) {
        super(brand,
                model,
                engineValue,
                needCategory,
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

        driverWitCategory.start();
        System.out.println(getBrand());
    }

    @Override
    public void stop() {
        driverWitCategory.start();
        System.out.println(getBrand());
    }
}

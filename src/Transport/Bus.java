package Transport;

public class Bus extends Transport {
    DriverWitCategory driverWitCategory = new DriverWitCategory("D");
    public Bus(String brand,
               String model,
               float engineValue,
               String needCategory) {
        super(brand,
                model,
                engineValue,
                needCategory);
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

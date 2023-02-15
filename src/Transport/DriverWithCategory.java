package Transport;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverWithCategory implements DriverBehavior {
    private String category;
    private String nameDriver;

    public DriverWithCategory(String nameDriver,
                              String category) {
        this.setNameDriver(nameDriver);
        this.setCategory(category);
    }

    public void addNewDriverToSet() {
        if (allDrivers.contains(this)) {
            System.out.println("Repeat addition. This driver added before: " + this);
        } else {
            allDrivers.add(this);
            System.out.println("Driver added to set: " + this);
        }
    }

    public static void allDriversToPrint() {
        Iterator<DriverWithCategory> iterAllDrivers = allDrivers.iterator();
        while (iterAllDrivers.hasNext()) {
            System.out.println(iterAllDrivers.next());
        }
    }


    static Set<DriverWithCategory> allDrivers = new HashSet<>();

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void start() {
        System.out.print("Водитель с правами категории " + getCategory() + " стартует на ");
    }


    @Override
    public void stop() {
        System.out.print("Водитель с правами категории " + getCategory() + " останавливается ");
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    @Override
    public String toString() {
        return "nameDriver=" + nameDriver
                + " category=" + category;
    }
}
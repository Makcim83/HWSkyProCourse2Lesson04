package Transport;

public class DriverWithCategory implements DriverBehavior {
    private String category;
    private String nameDriver;

    public DriverWithCategory(String category) {
        this.setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    @Override
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
}
package Transport;

public class DriverWitCategory implements MoveBehavior{
    public String category;

    public DriverWitCategory(String category) {
        this.category = category;
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
}

package Transport;

public class DriverDCategory implements StartBehavior, StopBehavior{


    @Override
    public void start() {
        System.out.print("Водитель с правами категории D стартует на ");
    }

    @Override
    public void stop() {
        System.out.print("Водитель с правами категории D останавливается ");
    }
}
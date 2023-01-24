package Transport;

public class DriverCCategory implements StartBehavior, StopBehavior{


    @Override
    public void start() {
        System.out.print("Водитель с правами категории С стартует на ");
    }

    @Override
    public void stop() {
        System.out.print("Водитель с правами категории С останавливается ");
    }
}
package Transport;

public interface DriverBehavior {
    default void start() {
        System.out.println("Can`t move");
    }

    default void stop() {
        System.out.println("Водитель не едет без прав ");
    }
}
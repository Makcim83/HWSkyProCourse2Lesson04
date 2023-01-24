package Transport;

public interface StopBehavior {
    default void stop(){
        System.out.println("Водитель не едет без прав ");
    };
}

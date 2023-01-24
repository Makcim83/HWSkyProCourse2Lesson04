package Transport;

public interface StartBehavior {
    default void start(){
        System.out.println("Can`t move");
    }
}

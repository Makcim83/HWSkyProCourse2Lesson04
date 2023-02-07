package Transport;

import java.util.Queue;

public class ServiceCenter {

    public static Queue<Transport> carsToService;

    public static void rotateQueue(Queue q) {
        Object o = q.peek();
        q.add(o);
        q.remove(o);
    }
}



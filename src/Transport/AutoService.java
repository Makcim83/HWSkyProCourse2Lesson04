package Transport;

import java.util.LinkedList;
import java.util.Queue;

public abstract class AutoService implements AutoServiceBehavior {
    public static Queue<Transport> carsToService;
    public static Queue<Mechanic> mechanics = new LinkedList();


    public Object getNextCarToService() {
        Object o = carsToService.peek();
        carsToService.remove(o);
        return o;
    }

    public static void rotateQueue(Queue q) {
        Object o = q.peek();
        q.add(o);
        q.remove(o);
    }

    public static <T extends Transport> void makeDiagnostic(Queue<Transport> carsToService) {
        while (carsToService.size() > 0) {
            AutoServiceBehavior.diagnostic(carsToService.poll());
        }
    }
}

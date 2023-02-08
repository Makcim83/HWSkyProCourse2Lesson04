package Transport;

import java.util.LinkedList;
import java.util.Queue;

public abstract class AutoService implements AutoServiceBehavior {
    public static Queue<Transport> carsToService;
    public static Queue<Mechanic> mechanics = new LinkedList<>();


    public Object getNextCarToService() {
        Object o = carsToService.peek();
        carsToService.remove(o);
        return o;
    }

    public static Mechanic getNextMechanic() {
        Mechanic m = mechanics.peek();
        rotateQueue(mechanics);
        return m;
    }

    public static void rotateQueue(Queue q) {
        Object o = q.peek();
        q.add(o);
        q.remove(o);
    }

    public static void diagnostic(Queue<Transport> carsToService) throws Exception {
        while (carsToService.size() > 0) {
            if (carsToService.peek().isNeedDiagnostic()) {
                AutoServiceBehavior.diagnostic(carsToService.poll());
            } else {
                System.out.println("Busses need not diagnostic");
                carsToService.remove();
            }
        }
    }
}

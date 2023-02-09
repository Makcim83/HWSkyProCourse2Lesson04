package Transport;

import java.util.LinkedList;
import java.util.Queue;

public abstract class AutoService {
    public static Queue<Transport> carsToService = new LinkedList<>();
    public static Queue<Mechanic> mechanics = new LinkedList<>();

    public static <T extends Transport> void diagnostic(Transport trr) {
            Mechanic m = mechanics.peek();
            System.out.println("Diagnostic of " + trr.getBrand() + " made by mechanic : " + m.toString());
            rotateQueue(mechanics);
    }

    public static void startDiagnostic(Queue<Transport> carsToService) throws Exception {
        while (carsToService.size() > 0) {
            if (carsToService.peek().isNeedDiagnostic()) {
                diagnostic(carsToService.poll());
            } else {
                System.out.println("Busses need not diagnostic");
                carsToService.remove();
            }
        }
    }

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
}


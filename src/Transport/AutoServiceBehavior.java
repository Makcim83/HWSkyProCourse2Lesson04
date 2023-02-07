package Transport;

import static Transport.AutoService.mechanics;
import static Transport.ServiceCenter.carsToService;
import static Transport.ServiceCenter.rotateQueue;

public interface AutoServiceBehavior {

    static <T extends Transport> void diagnostic(T t) throws Exception {
        if (t.isNeedDiagnostic()) {
            Mechanic m = mechanics.peek();
            System.out.println("Diannostic of " + t.getBrand() + " made by mechanic : " + m.toString());
            rotateQueue(mechanics);
        } else {
            carsToService.remove();
        }
    }
}

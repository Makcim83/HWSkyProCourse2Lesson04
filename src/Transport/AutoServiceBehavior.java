package Transport;

import java.util.Queue;

import static Transport.AutoService.*;

public interface AutoServiceBehavior {


    static <T extends Transport> void diagnostic(T t) {
        System.out.println("Diannostic of " + t.getBrand() + " made by mechanic : " + AutoService.mechanics.peek().toString());
        rotateQueue(mechanics);
    }
}
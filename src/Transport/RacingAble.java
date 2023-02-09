package Transport;

public interface RacingAble {
    int bestLapTime = 200;
    int maximalSpeed = 100;

    static void printAllRacingCars(Transport[] arr) {
        System.out.println("Racing List:");
        for (Transport t : arr
        ) {
            System.out.println(t.toString());
        }
    }

    static void startTheRace(Transport[] arr) {
        for (Transport tr : arr
        ) {
            tr.start();
        }
    }

    static void pitStop(Transport[] tr) {
        for (Transport t : tr
        ) {
            System.out.println("Pit stop!" + t.getBrand());
            t.stop();
            t.start();
        }
    }
}

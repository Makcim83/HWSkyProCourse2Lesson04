package Transport;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {

        ArrayList<Car> racingCars = new ArrayList<>();
        racingCars.add(new Car("JAWA", "5", .7f));
        racingCars.add(new Car("Audi", "A8", 1.7f));
        racingCars.add(new Car("Lada", "2101", 1.1f));
        racingCars.add(new Car("BMW", "7", 1.9f));
        ArrayList<Bus> racingBuses = new ArrayList<>();
        racingBuses.add(new Bus("Paz", "111", 1.2f));
        ArrayList<Truck> racingTrucks = new ArrayList<>();
        racingTrucks.add(new Truck("Kamaz", "2208", 2.0f));
        RacingAble.printAllRacingCars(racingCars.toArray(new Transport[0]));


        System.out.println("\nRace with all transport types");
        RacingAble.startTheRace(racingCars.toArray(new Transport[0]));

        System.out.println("\nRace only Cars");
        RacingAble.startTheRace(racingCars.toArray(new Car[0]));

        System.out.println("\nRace only Buses");
        RacingAble.startTheRace(racingBuses.toArray(new Bus[0]));

        System.out.println("\nRace only Trucks");
        RacingAble.startTheRace(racingTrucks.toArray(new Truck[0]));
    }



        //TestMain.testMain();

    public static void print(Object o) {
        System.out.println(o);
    }
}
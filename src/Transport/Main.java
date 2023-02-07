package Transport;

import java.util.ArrayList;
import java.util.LinkedList;

import static Transport.AutoService.carsToService;
import static Transport.AutoService.mechanics;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Car> racingCars = new ArrayList<>();
        racingCars.add(new Car("JAWA", "5", .7f, "B"));
        racingCars.add(new Car("Audi", "A8", 1.7f, "B"));
        racingCars.add(new Car("Lada", "2101", 1.1f, "B"));
        racingCars.add(new Car("BMW", "7", 1.9f, "B"));
        ArrayList<Bus> racingBuses = new ArrayList<>();
        racingBuses.add(new Bus("Paz", "111", 1.2f, "D"));
        ArrayList<Truck> racingTrucks = new ArrayList<>();
        racingTrucks.add(new Truck("Kamaz", "2208", 2.0f, "C"));
        racingTrucks.add(new Truck("ZIL", "130", 1.4f, "C"));
        RacingAble.printAllRacingCars(racingCars.toArray(new Transport[0]));

        System.out.println("\nAuto service personal will make Diagnostic Cars before Racing");
        AutoService.mechanics.offer(new Mechanic("Ivan", "Wheels"));
        AutoService.mechanics.offer(new Mechanic("Oleg", "Car Motors"));
        AutoService.mechanics.offer(new Mechanic("Andrey", "Welding works"));
        AutoService.mechanics.offer(new Mechanic("Michail", "Wash and clean"));
        System.out.println(mechanics.toString());

        ArrayList<Transport> allTypesOfTransport = new ArrayList<>();
        allTypesOfTransport.addAll(racingCars);
        allTypesOfTransport.addAll(racingBuses);
        allTypesOfTransport.addAll(racingTrucks);

        System.out.println("\nAll types of transport added to diagnostic queue");
        carsToService = new LinkedList<>();
        carsToService.addAll(allTypesOfTransport);
        AutoService.diagnostic(carsToService);


        System.out.println("\nRace with all transport types");
        RacingAble.startTheRace(allTypesOfTransport.toArray(new Transport[0]));

        System.out.println("\nRace only Cars");
        RacingAble.startTheRace(racingCars.toArray(new Car[0]));

        System.out.println("\nRace only Buses");
        RacingAble.startTheRace(racingBuses.toArray(new Bus[0]));

        System.out.println("\nRace only Trucks");
        RacingAble.startTheRace(racingTrucks.toArray(new Truck[0]));

        //TestMain.testMain();
    }
}
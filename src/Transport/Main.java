package Transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Transport.AutoService.carsToService;


public class Main {
    public static void main(String[] args) {

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

        AutoService.mechanics.offer(new Mechanic("Ivan", "Wheels"));
        AutoService.mechanics.offer(new Mechanic("Oleg", "Car Motors"));
        AutoService.mechanics.offer(new Mechanic("Andrey", "Welding works"));

        System.out.println("\nRace with all transport types");
        ArrayList<Transport> allTypesOfTransport = new ArrayList<>();
        allTypesOfTransport.addAll(racingCars);
        allTypesOfTransport.addAll(racingBuses);
        allTypesOfTransport.addAll(racingTrucks);
        RacingAble.startTheRace(allTypesOfTransport.toArray(new Transport[0]));

        System.out.println("\nRace only Cars");
        RacingAble.startTheRace(racingCars.toArray(new Car[0]));

        System.out.println("\nRace only Buses");
        RacingAble.startTheRace(racingBuses.toArray(new Bus[0]));

        System.out.println("\nRace only Trucks");
        RacingAble.startTheRace(racingTrucks.toArray(new Truck[0]));

        System.out.println("\nDiagnostic of all transport types");


        Car forTestCar = new Car("TestMoto", "5", .7f, "B");
        AutoServiceBehavior.diagnostic(forTestCar);

        System.out.println("All types of transport added to diagnostic queue");
        carsToService = new LinkedList<Transport>();
        carsToService.addAll(allTypesOfTransport);
        AutoService.makeDiagnostic(carsToService);





        //TestMain.testMain();
    }
}
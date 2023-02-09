package Transport;

import java.util.ArrayList;
import java.util.HashMap;

import static Transport.AutoService.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAuto service personal will make Diagnostic Cars before Racing");
        mechanics.offer(new Mechanic("Ivan", "Wheels"));
        mechanics.offer(new Mechanic("Oleg", "Car Motors"));
        mechanics.offer(new Mechanic("Andrey", "Welding works"));
        mechanics.offer(new Mechanic("Michail", "Wash and clean"));
        System.out.println(mechanics);

        ArrayList<Car> racingCars = new ArrayList<>();
        racingCars.add(new Car("JAWA", "5", .7f, "B", new Mechanic("Oleg", "Car Motors")));
        racingCars.add(new Car("Audi", "A8", 1.7f, "B", new Mechanic("Andrey", "Welding works")));
        racingCars.add(new Car("Lada", "2101", 1.1f, "B", getNextMechanic()));
        racingCars.add(new Car("BMW", "7", 1.9f, "B", getNextMechanic()));
        ArrayList<Bus> racingBuses = new ArrayList<>();
        racingBuses.add(new Bus("Paz", "111", 1.2f, "D", getNextMechanic()));
        ArrayList<Truck> racingTrucks = new ArrayList<>();
        racingTrucks.add(new Truck("Kamaz", "2208", 2.0f, "C", new Mechanic("Ivan", "Truck Fabric")));
        racingTrucks.add(new Truck("ZIL", "130", 1.4f, "C", new Mechanic("Ivan", "Truck Fabric")));

        ArrayList<Transport> allTypesOfTransport = new ArrayList<>();
        allTypesOfTransport.addAll(racingCars);
        allTypesOfTransport.addAll(racingBuses);
        allTypesOfTransport.addAll(racingTrucks);


        System.out.println("\nHashMap realisation");
        HashMap<Transport, Mechanic> repairTeams = new HashMap<>();
        for (Transport transport : allTypesOfTransport
        ) {
            repairTeams.put(transport, transport.getMechanic());
        }
        for (HashMap.Entry<Transport, Mechanic> team : repairTeams.entrySet()) {
            System.out.println("Transport : " + team.getKey() + ", Mechanic : " + team.getValue());
        }


        System.out.println("\nAll types of transport added to diagnostic queue");
        AutoService.carsToService.addAll(allTypesOfTransport);
        startDiagnostic(carsToService);

        RacingAble.printAllRacingCars(racingCars.toArray(new Transport[0]));

        System.out.println("\nRace with all transport types");
        RacingAble.startTheRace(allTypesOfTransport.toArray(new Transport[0]));

        System.out.println("\nRace only Cars");
        RacingAble.startTheRace(racingCars.toArray(new Car[0]));

        System.out.println("\nRace only Buses");
        RacingAble.startTheRace(racingBuses.toArray(new Bus[0]));

        System.out.println("\nRace only Trucks");
        RacingAble.startTheRace(racingTrucks.toArray(new Truck[0]));
    }
}
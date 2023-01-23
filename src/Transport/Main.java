package Transport;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Some Cars");

        Car moto = new Car("JAWA", "5", .7f);
        Car audi = new Car("Audi", "A8", 1.7f);
        Car lada = new Car("Lada", "2101", 1.1f);
        Car bmw = new Car("BMW", "7", 1.9f);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(moto);
        cars.add(audi);
        cars.add(lada);
        cars.add(bmw);

        Transport.startTheRace(cars.toArray(new Car[0]));

        //TestMain.testMain();
    }

    public static void print(Object o) {
        System.out.println(o);
    }



    public static void printAllCars(Car[] arr) {
        for (Car t : arr
        ) {
            System.out.println("\n" + t.toString());
        }
    }
}
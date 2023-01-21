package Transport;

public class Main {
    public static void main(String[] args) {
        Car bike = new Car("JAWA", "5", 1997, "Russia", "Red", 150, 0);


        print(bike);
        TestMain.testMain();
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
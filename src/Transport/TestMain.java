package Transport;

public class TestMain {
    public static void testMain() {

        System.out.println("\nTest. Start objects");
        Car bike = new Car("JAWA", "5", .9f);
        Main.print(bike);
        System.out.println("Test. Objects after modification:");
        Main.print(new Car("    ", "", -.9f));
        //Main.print(new Car(null, null, null));



    }
}

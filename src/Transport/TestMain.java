package Transport;

public class TestMain {
    public static void testMain() {
        Car bikeTest = new Car("JAWA", "5", 1997, "Russia", "Red", 150, 0);


        System.out.println("\nTest. Start objects");
        Main.print(bikeTest);

        System.out.println("Test. Objects after modification:");
        bikeTest.setBrand(null);
        bikeTest.setModel("");
        bikeTest.setColor("    ");
        bikeTest.setMaximalSpeed(-10);
        bikeTest.setNumOfDoors(-1);
        Main.print(bikeTest);



    }
}

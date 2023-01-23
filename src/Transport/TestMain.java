package Transport;

public class TestMain {
    public static void testMain() {

        System.out.println("\nTest. Start objects");
        Car bike = new Car("JAWA", "5", .9f);
        Main.print(bike);
        System.out.println("Test. Objects after modification:");
        Main.print(new Car("    ", "", -.9f));
        Main.print(new Car(null, null, 0f));

        // тест validateFloat(float) нужно будет переделать для проверки на null
        // и после удалить комментарий. тест на данный момет не проходит.
        //Main.print(new Car(null, null, null));
    }
}

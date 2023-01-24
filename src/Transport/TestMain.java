package Transport;

public class TestMain {
    public static void testMain() {

        System.out.println("\nTest. Start objects");
        Car bike = new Car("JAWA", "5", .9f, "B");
        System.out.println(bike.toString());
        System.out.println("Test. Objects after modification:");
        System.out.println((new Car("    ", "", -.9f, "B")).toString());
        System.out.println((new Car(null, null, 0f, "B")).toString());


        // тест validateFloat(float) нужно будет переделать для проверки на null
        // и после удалить комментарий. тест на данный момет не проходит.
        //Main.print(new Car(null, null, null));
    }
}

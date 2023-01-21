import Transport.Transport;

public class Bus extends Transport {
    private int numOfPassengers;

    public Bus(String brand, String model, int year, String country, String color, int maximalSpeed, int numOfPassengers) {
        super(brand, model, year, country, color, maximalSpeed);
        setNumOfPassengers(numOfPassengers);
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = validateInt(numOfPassengers);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numOfPassengers=" + numOfPassengers;
    }
}

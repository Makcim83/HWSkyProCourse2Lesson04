package Transport;
public class Car extends Transport {
    public int numOfDoors;

    public Car(String brand,
               String model,
               int year,
               String country,
               String color,
               int maximalSpeed,
               int numOfDoors) {
        super(brand,
                model, year, country, color, maximalSpeed);
        setNumOfDoors(numOfDoors);
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = validateInt(numOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numOfDoors=" + numOfDoors;
    }
}
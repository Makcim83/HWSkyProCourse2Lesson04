package Transport;

public interface RacingAble {
    int bestLapTime = 0;
    int maximalSpeed = 0;


    static void pitStop(Transport tr){
        System.out.println("Pit stop!" + tr.getBrand());
    }


}

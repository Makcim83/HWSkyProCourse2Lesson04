package Transport;

public class Mechanic extends AutoService {
    public Mechanic(
            String name,
            String company){

    }

    public <T extends Transport> void makeDiagnostic (T t){
        System.out.println("Произведена диагностика " + t.getBrand());
    }


}

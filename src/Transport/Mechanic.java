package Transport;

public class Mechanic implements AutoServiceBehavior {
    private String name;
    private String company;

    public Mechanic(String name,
                    String company) {
        this.name = getName();
        this.company = getCompany();
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return ("Mechaic " + this.getName() + " " + this.getCompany());
    }
}
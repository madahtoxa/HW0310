import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Truck extends Transport implements Competing {
    private Set<String> truck = new HashSet<>();

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Set<String> getListTruck() {
        return truck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck1 = (Truck) o;
        return truck.equals(truck1.truck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truck);
    }

    @Override
    public String toString() {
        return "Trucks{}";
    }

    @Override
    public void refill() {
        System.out.println("Fuel for Truck");
    }

    public void addDriver(String oleg, boolean b, int i, String b1, Truck bmv) {

    }

    @Override
    public String[] pitStop() {
        return new String[0];
    }

    @Override
    public double bestLapTime() {
        return 0;
    }

    @Override
    public int maximumSpeed() {
        return 0;
    }
}
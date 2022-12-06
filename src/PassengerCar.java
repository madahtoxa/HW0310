import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassengerCar extends Transport implements Competing {
    private Set<String> listPassengerCar = new HashSet<>();

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Set<String> getListPassengerCar() {
        return listPassengerCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCar that = (PassengerCar) o;
        return listPassengerCar.equals(that.listPassengerCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listPassengerCar);
    }

    @Override
    public void refill() {
        System.out.println("Fuel for Car");
    }
    @Override
    public String toString() {
        return "PassengerCars{}";
    }


    public void addDriver(String a, boolean b, int i, String b1, PassengerCar d) {
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
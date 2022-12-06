import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Transport> transports = new HashSet<>();

        PassengerCar audi = new PassengerCar("Audi", "TT", 5.4);
        audi.addDriver("Anton", true, 5, "B", audi);


        Truck bmv = new Truck("BMW", "E30", 7.0);
        bmv.addDriver("Vlad", true, 5, "B", bmv);


        Bus paz = new Bus("Paz", "3205", 3.1);
        paz.addDriver("Ivan", true, 5, "B", paz);

     }

}
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || brand.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        setEngineVolume(engineVolume);
    }

    private void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.add((Driver<?>) Driver.getDriver());
    }




    public static void printInfo(Transport transport) {
        System.out.println("Info:" + transport.getBrand() + " " + transport.getModel());
        System.out.println("Drivers:");
        for (Driver<?> driver : transport.drivers) {
            System.out.println(driver.getName());
        }
    }
}
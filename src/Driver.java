import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Driver <T extends Transport & Competing> {
    private String name;
    private boolean thePresenceOfDriverLicense;
    private int experience;
    private T transport;
    private Set<String> listDriver = new HashSet<>();
    private static Object driver;

    public Driver(Set<String> listDriver) {
        this.listDriver = listDriver;
    }

    public Driver(String name, boolean thePresenceOfDriverLicense, int experience, String categoryCDriver, Truck transport) {
    }

    public Driver(String name, boolean thePresenceOfDriverLicense, int experience, String categoryCDriver, Bus transport) {
    }

    public Set<String> getListDriver() {
        return listDriver;
    }

    public Driver(String name, boolean thePresenceOfDriverLicense, int experience, String CategoryCDriver, PassengerCar transport) {
        this.name = name;
        this.thePresenceOfDriverLicense = thePresenceOfDriverLicense;
        this.experience = experience;
    }

    public void setExperience(int experience) {
        if (experience > 0)
            this.experience = experience;
    }

    public static Object getDriver() {
        return driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return thePresenceOfDriverLicense == driver.thePresenceOfDriverLicense && experience == driver.experience
                && Objects.equals(name, driver.name) && Objects.equals(transport, driver.transport)
                && Objects.equals(listDriver, driver.listDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, thePresenceOfDriverLicense, experience, transport, listDriver);
    }

    public T getTransport() {
        return transport;
    }

    public boolean isThePresenceOfDriverLicense() {
        return thePresenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            return name;
        }
        return null;
    }


}
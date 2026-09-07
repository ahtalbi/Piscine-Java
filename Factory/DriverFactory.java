public class DriverFactory {
    public static Driver getDriver(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new CarDriver();
        } else if ("Plane".equalsIgnoreCase(type)) {
            return new PlaneDriver();
        }
        return null;
    }
}
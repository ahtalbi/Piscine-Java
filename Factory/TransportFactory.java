public class TransportFactory {
    public static Transport getTransport(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Plane".equalsIgnoreCase(type)) {
            return new Plane();
        }
        return null;
    }
}
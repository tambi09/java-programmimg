package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver();
        bus.engine = new Engine();
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver();
        metroBus.engine = new Engine();

        System.out.println(metroBus);

        System.out.println(metroBus.driver.getName());
    }
}

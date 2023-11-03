package ahpu.vehicle;

public class Demo {
    public static void main(String[] args) {
        Bus bus=new Bus();
        Aircraft aircraft=new Aircraft();
        Driver driver=new Driver();

        bus.transport();
        aircraft.transport();
        driver.drive();
    }
}

package ahpu.vehicle;

public class Driver extends Vehicle{
    Vehicle vehicle=new Vehicle() {
        @Override
        public void transport() {
            System.out.println("A taix is driving......");
        }
    };

    public void transport() {
        System.out.println("A taix is driving......");
    }
    public  void drive(){
        vehicle.transport();
    }
}

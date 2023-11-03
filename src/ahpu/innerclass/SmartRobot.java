package ahpu.innerclass;

public class SmartRobot {
    Car car=new Car() {
        @Override
        public void start() {
            System.out.println("the car start");
        }

        @Override
        public void accelerate() {
            System.out.println("the car accelebrate");
        }

        @Override
        public void brake() {
            System.out.println("the car break");
        }
    };

    public void drive(){
        car.start();
        car.accelerate();
        car.brake();
    }

    public void set(){

    }
    public  void get(){

    }
}

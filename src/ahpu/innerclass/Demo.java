package ahpu.innerclass;

public class Demo {
    public static void main(String[] args) {
        SmartRobot robot=new SmartRobot();
        Car car=new Car() {
            @Override
            public void start() {

            }

            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        robot.drive();
    }

}

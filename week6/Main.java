
public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car("BMW");
        Vehicle v2 = new Motocycle("Yamaha");
        Vehicle v3 = new Truck("Isuzu");

        v1.startEngine();
        v2.startEngine();
        v3.startEngine();

        System.out.println("----------------------");

        v1.stopEngine();
        v2.stopEngine();
        v3.stopEngine();

        System.out.println("----------------------");

        // เรียกใช้ฟังก์ชันเฉพาะของแต่ละคลาส
        Car car = new Car("BMW");
        car.turnLeft();
        car.turnRight();

        System.out.println("----------------------");

        Motocycle bike = new Motocycle("Yamaha");
        bike.twoWheels();
        bike.fireEx();

        System.out.println("----------------------");

        Truck truck = new Truck("Isuzu");
        truck.trailer();
    }
}
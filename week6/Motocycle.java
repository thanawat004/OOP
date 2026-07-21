public class Motocycle extends Vehicle {

    public Motocycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " : Motorcycle Engine Started");
    }

    public void fireEx() {
        System.out.println(brand + " : มีท่อไอเสียอยู่ด้านท้าย");
    }

    // เพิ่มฟังก์ชัน
    public void twoWheels() {
        System.out.println(brand + " : มี 2 ล้อ");
    }
}

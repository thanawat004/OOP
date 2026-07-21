public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " : Truck Engine Started");
    }

    // เพิ่มฟังก์ชัน
    public void trailer() {
        System.out.println(brand + " : ต่อพ่วงหลัง บรรทุกได้ 18 ตัน");
    }
}

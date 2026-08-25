public class Beverage extends Food implements ColdServe {

    public Beverage(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category  : Beverage");
    }

    @Override
    public void prepare() {
        System.out.println("Process   : Preparing the beverage...");
        System.out.println("Result    : " + name + " is ready.");
    }

    @Override
    public void serveCold() {
        System.out.println("Cold Service : " + name);
        System.out.println("Status       : Served Cold");
    }
}
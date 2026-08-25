public class NoodleDish extends Food {

    public NoodleDish(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category  : Noodle Menu");
    }

    @Override
    public void prepare() {
        System.out.println("Process   : Preparing the noodle dish...");
        System.out.println("Result    : " + name + " has been cooked successfully.");
    }
}
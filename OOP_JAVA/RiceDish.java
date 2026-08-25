public class RiceDish extends Food {

    public RiceDish(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category  : Rice Menu");
    }

    @Override
    public void prepare() {
        System.out.println("Process   : Preparing the rice dish...");
        System.out.println("Result    : " + name + " has been fried successfully.");
    }
}
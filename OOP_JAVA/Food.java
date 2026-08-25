public abstract class Food {

    protected String name;

    public Food(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Food Name : " + name);
    }

    public abstract void prepare();
}
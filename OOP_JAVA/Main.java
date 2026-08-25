public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("        RESTAURANT FOOD SYSTEM");
        System.out.println("========================================");

        // Create Food Objects
        Food food1 = new RiceDish("Fried Rice");
        Food food2 = new NoodleDish("Pad Thai");
        Food food3 = new Beverage("Iced Tea");

        // Polymorphism
        Food[] foods = {food1, food2, food3};

        int number = 1;

        for (Food food : foods) {

            System.out.println();
            System.out.println("[ Food No." + number + " ]");

            food.displayInfo();
            food.prepare();

            System.out.println("----------------------------------------");

            number++;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("          SPECIAL SERVICE");
        System.out.println("========================================");

        // ใช้งาน Interface
        ColdServe coldFood = (ColdServe) food3;
        coldFood.serveCold();

        System.out.println();
        System.out.println("========================================");
        System.out.println("       END OF FOOD INFORMATION");
        System.out.println("========================================");
    }
}
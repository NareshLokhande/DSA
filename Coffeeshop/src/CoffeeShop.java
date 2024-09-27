import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {

    static ArrayList<MenuItem> coffeeShopMenu = new ArrayList<>();
    static String coffeeShopName = "The Java Place"; // Give your coffee shop a name
    static int maxOrderCount = 4;
    static int currentOrderCount = 0;
    static double dailyRevenue = 0;

    public static void main(String[] args) {
        Ingredient coffee = new Ingredient("coffee", 3.00);
        Ingredient steamedMilk = new Ingredient("steamed milk", 1.00);
        Ingredient cocoa = new Ingredient("cocoa", 1.00);

        coffeeShopMenu.add(new MenuItem("Coffee", new Ingredient[]{coffee}));
        coffeeShopMenu.add(new MenuItem("Latte", new Ingredient[]{coffee, steamedMilk}));
        coffeeShopMenu.add(new MenuItem("Mocha", new Ingredient[]{coffee, steamedMilk, cocoa}));

        Scanner sc = new Scanner(System.in);
        while (currentOrderCount < maxOrderCount) {
            System.out.println("Welcome to " + coffeeShopName + "! Thank you for stopping by. Here is our menu; what would you like to order? \n"
                    + "Please enter the number for the option you'd like to order: \n"
                    + "1. Coffee\n"
                    + "2. Latte\n"
                    + "3. Mocha\n");
            int drinkChoice = sc.nextInt();
            processOrder(drinkChoice);
            currentOrderCount++;
            System.out.println("Thank you for your order!");
        }
        System.out.println("\nAnother great day at the coffee shop! Today we made " + dailyRevenue + " dollars! \n");
        sc.close();
    }

    private static void processOrder(int drinkChoice) {
        MenuItem selectedItem = null;
        switch (drinkChoice) {
            case 1:
                selectedItem = coffeeShopMenu.get(0);
                break;
            case 2:
                selectedItem = coffeeShopMenu.get(1);
                break;
            case 3:
                selectedItem = coffeeShopMenu.get(2);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid menu item.");
                return; // Exit the method if invalid choice
        }

        dailyRevenue += selectedItem.getCost(); // Add the cost to daily revenue
        System.out.println("You selected " + selectedItem.getName() + " costing " + selectedItem.getCost() + " dollars.");
    }
}

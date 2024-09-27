public class MenuItem {
    private String name;
    private Ingredient[] ingredients;

    public MenuItem(String name, Ingredient[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        double totalCost = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalCost += ingredient.getCost(); // Sum up the cost of each ingredient
        }
        return totalCost;
    }
}

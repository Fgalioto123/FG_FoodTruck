import java.util.Arrays;

public class foodItems {
    private String name;
    private double cost;
    private ingredients[] recipe;

    public static void main(String[] args) {
        
    }

    public foodItems(String name, double cost, ingredients[] recipe) {
        this.name = name;
        this.cost = cost;
        this.recipe = recipe;
        
    }

    public String getName() {
        return name;
    }

    public String getRecipe() {
        return Arrays.toString(recipe);
    }
}

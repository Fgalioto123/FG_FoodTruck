public class Customers {
    private String name;
    private foodItems food;
    private int ratingLossOrGain;
    private String rarity;

    

    public static void main(String[] args) {
        
    }

    public Customers(String name, foodItems food, int ratingLossOrGain, int rarity) {
        String[] rarities = {"Common", "Common", "Common", "Common", "Rare"};
        
        this.name = name;
        this.food = food;
        this.ratingLossOrGain = ratingLossOrGain;
        this.rarity = rarities[rarity];
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public foodItems getFoodItems() {
        return food;
    }


    public int getRatingLossOnFailuere() {
        return ratingLossOrGain;
    }

    @Override
    public String toString() {
        if(rarity.equals("Common")) {
            return "The customer's name is " + name + ", the food they want is " + food.getName() + ", and the recipe for that food item is " + food.getRecipe() + ". For completing their order you will gain " + ratingLossOrGain + " rating, their rarity is "
                + rarity + ".";
        } else {
            return "Wow you found a Rare customer. You will receive double pay for this customer. The customer's name is " + name 
            + ", the food they want is " + food.getName() + ", and the recipe for that food item is " + food.getRecipe() + ". For completing their order you will gain " 
            + ratingLossOrGain + " rating.";
                
        }
        
    }
}



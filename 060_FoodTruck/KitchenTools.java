public class KitchenTools {
    private String type;
    private String name;
    private int cost;
    private int profitMultiplierPercent;
    private int ratingUpgradeAmount;
    //need to make thew kitchentools that are basically the upgrades the player can buy for things like makes better food = more money, quicker cook time, etc. 

    public static void main(String[] args) {
        
    }

    public KitchenTools(String type, String name, int cost, int profitMultiplierPercent, int ratingUpgradeAmount) {
        this.type = type;
        this.name = name;
        this.cost = cost;
        this.profitMultiplierPercent = profitMultiplierPercent;
        this.ratingUpgradeAmount = ratingUpgradeAmount;
    }

    
}

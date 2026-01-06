public class players {
    private double balance;
    private int moneyMultiplier;
    private int rating;

    public static void main(String[] args) {
        
    }

    public players(double balance, int moneyMultiplier, int rating) {
        this.balance = balance;
        this.moneyMultiplier = moneyMultiplier;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Your balance is " + balance + ", moneyMultiplier is " + moneyMultiplier + ", and your rating is " + rating;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMoneyMultiplier() {
        return moneyMultiplier;
    }

    public void setMoneyMultiplier(int moneyMultiplier) {
        this.moneyMultiplier = moneyMultiplier;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    
    
    
}

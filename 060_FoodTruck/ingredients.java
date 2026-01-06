public class ingredients {
    private String name;
    private boolean NeedsToBeKeptCold;
    private boolean NeedsToBeCut;
    private boolean NeedsToBeWashed;

    public static void main(String[] args) {
        
    }

    public ingredients(String name, boolean needsToBeKeptCold, boolean needsToBeCut, boolean needsToBeWashed) {
        this.name = name;
        NeedsToBeKeptCold = needsToBeKeptCold;
        NeedsToBeCut = needsToBeCut;
        NeedsToBeWashed = needsToBeWashed;
    }

    @Override
    public String toString() {
        return name;
    }
}

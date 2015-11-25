package be.xploregroup.joe.oxygen.model;

/**
 * Created by bertswinnen on 29/09/15.
 */
public class OxygenSupply {
    public static final double MAXIMUM_SUPPLY = 100;
    private double level;

    public OxygenSupply(){}

    public OxygenSupply(double level){
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    /**
     * Replenishes oxygen.
     * @param amount To replenish.
     */
    public void replenish(double amount){
        this.level += amount;

        // Supply can not be higher than maximum
        this.level = this.level > MAXIMUM_SUPPLY ? MAXIMUM_SUPPLY : this.level;
    }

    /**
     * Reduces oxygen from the supply.
     * @param amount To reduce.
     * @return Amount reduced.
     */
    public double reduce(double amount){
        double levelRef = this.level;

        // reduce with given amount
        this.level -= amount;

        // Supply can not be less than zero
        this.level = this.level < 0 ? 0 : this.level;

        // Return the amount that was reduced.
        return levelRef - this.level;
    }
}

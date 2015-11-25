package be.xploregroup.joe.oxygen.model;

/**
 * Created by bertswinnen on 13/10/15.
 */
public class OxygenObtained {
    private double amount;
    private OxygenSupply oxygenSupply;

    public OxygenObtained(){}

    public OxygenObtained(double amount, OxygenSupply oxygenSupply) {
        this.amount = amount;
        this.oxygenSupply = oxygenSupply;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OxygenSupply getOxygenSupply() {
        return oxygenSupply;
    }

    public void setOxygenSupply(OxygenSupply oxygenSupply) {
        this.oxygenSupply = oxygenSupply;
    }
}

package be.xploregroup.joe.oxygen.dto;

/**
 * Created by bertswinnen on 29/09/15.
 */
public class OxygenObtainedDTO {
    private double amount;
    private OxygenSupplyDTO oxygenSupplyDTO;
    private String hostName = "-";
    private String hostIp = "-";

    public OxygenObtainedDTO() {
    }

    public OxygenObtainedDTO(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OxygenSupplyDTO getOxygenSupplyDTO() {
        return oxygenSupplyDTO;
    }

    public void setOxygenSupplyDTO(OxygenSupplyDTO oxygenSupplyDTO) {
        this.oxygenSupplyDTO = oxygenSupplyDTO;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }
}

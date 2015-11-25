package be.xploregroup.joe.oxygen.dto;

/**
 * Created by bertswinnen on 29/09/15.
 */
public class OxygenReductionDTO {
    private double reduction;
    private String hostName;
    private String hostIp;

    public OxygenReductionDTO() {

    }

    public OxygenReductionDTO(double reduction) {
        this.reduction = reduction;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
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

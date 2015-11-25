package be.xploregroup.joe.oxygen.dto;

/**
 * Created by bertswinnen on 29/09/15.
 */
public class OxygenSupplyDTO {
    private double level;
    private String hostName;
    private String hostIp;

    public OxygenSupplyDTO() {
    }

    public OxygenSupplyDTO(double level) {
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public OxygenStatus getOxygenStatus() {
        if (level > 25) {
            return OxygenStatus.HIGH;
        } else if (level > 0) {
            return OxygenStatus.PROBLEMATIC;
        } else {
            return OxygenStatus.DEPLETED;
        }
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

package be.xploregroup.joe.oxygen.configuration;

import be.xploregroup.joe.oxygen.OxygenSystemType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bertswinnen on 12/10/15.
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="oxygen")
public class OxygenConfiguration {
    private double start = 80;
    private double increment = 5;
    private int interval = 60000;
    private OxygenSystemType oxygenSystemType;

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public OxygenSystemType getOxygenSystemType() {
        return oxygenSystemType;
    }

    public void setType(String type) {
        this.oxygenSystemType = OxygenSystemType.getByType(type);
    }
}

package be.xploregroup.joe.oxygen.repository;

import be.xploregroup.joe.oxygen.OxygenSystemType;
import be.xploregroup.joe.oxygen.configuration.OxygenConfiguration;
import be.xploregroup.joe.oxygen.model.OxygenObtained;
import be.xploregroup.joe.oxygen.model.OxygenSupply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Created by bertswinnen on 12/10/15.
 */
@Repository
public class OxygenRepository {

    private static Logger logger = LoggerFactory.getLogger(OxygenRepository.class);

    @Autowired
    private OxygenConfiguration oxygenConfiguration;

    private OxygenSupply oxygenSupply;

    public OxygenRepository() {
    }

    @PostConstruct
    public void init() {
        // Initialize with start level and a maximum capacity (configurable).
        this.oxygenSupply = new OxygenSupply(oxygenConfiguration.getStart());
    }

    public OxygenSupply get() {
        return this.oxygenSupply;
    }

    public void replenish() {
        // PREMIUM is times two.
        double factor = (OxygenSystemType.NORMAL == oxygenConfiguration.getOxygenSystemType()) ? 1 : 2;
        double increment = oxygenConfiguration.getIncrement() * factor;
        logger.info("replenishing with " + increment + " %");
        this.oxygenSupply.replenish(increment);
        logger.info("current supply is " + this.oxygenSupply.getLevel() + " %");
    }

    public OxygenObtained reduce(double amount){
        logger.info("reducing with " + amount + " units..");
        double obtained = this.oxygenSupply.reduce(amount);
        logger.info("current supply is " + this.oxygenSupply.getLevel() + " %");

        return new OxygenObtained(obtained, this.get());
    }
}

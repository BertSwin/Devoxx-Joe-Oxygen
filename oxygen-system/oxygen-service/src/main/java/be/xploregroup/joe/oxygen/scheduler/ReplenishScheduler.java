package be.xploregroup.joe.oxygen.scheduler;

import be.xploregroup.joe.oxygen.service.OxygenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by bertswinnen on 12/10/15.
 */
@Component
@EnableScheduling
public class ReplenishScheduler {
    @Autowired
    private OxygenService oxygenService;

    @Scheduled(fixedDelayString = "${oxygen.interval}")
    public void replenish() {
        oxygenService.replenish();
    }
}

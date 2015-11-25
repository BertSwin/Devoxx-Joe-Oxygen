package be.xploregroup.joe.oxygen.service;

import be.xploregroup.joe.oxygen.dto.OxygenObtainedDTO;
import be.xploregroup.joe.oxygen.dto.OxygenSupplyDTO;
import be.xploregroup.joe.oxygen.model.OxygenObtained;
import be.xploregroup.joe.oxygen.model.OxygenSupply;
import be.xploregroup.joe.oxygen.repository.OxygenRepository;
import be.xploregroup.joe.oxygen.util.SystemUtil;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bertswinnen on 29/09/15.
 */
@Service
public class OxygenService {
    @Autowired
    private OxygenRepository oxygenRepository;

    private static Logger logger = LoggerFactory.getLogger(OxygenService.class);

    private Mapper mapper;

    public OxygenObtainedDTO reduce(double reduction){
        // Default return, will be no oxygen obtained.
        OxygenObtained oxygenObtained;

        oxygenObtained = oxygenRepository.reduce(reduction);

        OxygenObtainedDTO oxygenObtainedDTO = mapper.map(oxygenObtained, OxygenObtainedDTO.class);
        oxygenObtainedDTO.setHostName(SystemUtil.getHostName());
        oxygenObtainedDTO.setHostIp(SystemUtil.getIp());

        return oxygenObtainedDTO;
    }

    public void replenish(){
        oxygenRepository.replenish();
    }

    public OxygenSupplyDTO getOxygenSupply(){
        OxygenSupply oxygenSupply = oxygenRepository.get();
        logger.info("Current oxygen supply " + oxygenSupply.getLevel() + " %");

        OxygenSupplyDTO oxygenSupplyDTO = mapper.map(oxygenSupply, OxygenSupplyDTO.class);
        oxygenSupplyDTO.setHostName(SystemUtil.getHostName());
        oxygenSupplyDTO.setHostIp(SystemUtil.getIp());

        return oxygenSupplyDTO;
    }

    @Autowired
    private void setMapper(Mapper mapper){
        this.mapper = mapper;
    }
}

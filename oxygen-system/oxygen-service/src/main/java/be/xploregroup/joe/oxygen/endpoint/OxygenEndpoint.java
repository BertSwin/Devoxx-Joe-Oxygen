package be.xploregroup.joe.oxygen.endpoint;

import be.xploregroup.joe.oxygen.dto.OxygenObtainedDTO;
import be.xploregroup.joe.oxygen.dto.OxygenReductionDTO;
import be.xploregroup.joe.oxygen.dto.OxygenSupplyDTO;
import be.xploregroup.joe.oxygen.model.OxygenObtained;
import be.xploregroup.joe.oxygen.service.OxygenService;
import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bertswinnen on 26/09/15.
 */
@Api(value = "/", description = "Oxygen Endpoint")
@RestController
@RequestMapping("oxygen")
public class OxygenEndpoint {
    @Autowired
    private OxygenService oxygenService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<OxygenSupplyDTO> getAvailableOxygen() {
        return new ResponseEntity<OxygenSupplyDTO>(
                oxygenService.getOxygenSupply(), new HttpHeaders(),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<OxygenObtainedDTO> reduceOxygen(@RequestBody OxygenReductionDTO oxygenReductionDTO){
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpStatus httpStatus = HttpStatus.OK;

        OxygenObtainedDTO oxygenObtainedDTO = this.oxygenService.reduce(oxygenReductionDTO.getReduction());

        return new ResponseEntity<OxygenObtainedDTO>(oxygenObtainedDTO, httpHeaders, httpStatus);
    }

    @Autowired
    public void setOxygenService(OxygenService oxygenService){
        this.oxygenService = oxygenService;
    }
}

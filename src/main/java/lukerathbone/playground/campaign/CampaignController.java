package lukerathbone.playground.campaign;

import io.swagger.annotations.Api;
import net.logstash.logback.marker.Markers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/{accountId}/campaign")
@Api(tags = "campaign")
public class CampaignController {

    private static final Logger LOG = LoggerFactory.getLogger(CampaignController.class);

    private final SaveCampaign saveCampaign;

    @Autowired
    public CampaignController(SaveCampaign saveCampaign) {
        this.saveCampaign = saveCampaign;
    }

    @PostMapping
    public void save(@PathVariable int accountId, @RequestBody Campaign campaign) {
        try {
            MDC.put("accountId", Integer.toString(accountId));
            MDC.put("feature", "campaign");
            LOG.debug(Markers.append("campaign", campaign), "Received campaign - {}", campaign);
            saveCampaign.save(campaign);

            if (new Random().nextInt(5) == 1) {
                throw new Exception("BAD STUFF!");
            }

        } catch (Exception exception) {
            LOG.error("Failed to save campaign!", exception);
        } finally {
            MDC.clear();
        }
    }

}

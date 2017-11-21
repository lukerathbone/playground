package lukerathbone.playground.campaign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
class SaveCampaign {

    private static final Logger LOG = LoggerFactory.getLogger(SaveCampaign.class);

    void save(Campaign campaign) {
        LOG.debug("Saving campaign");
        campaign.setId(UUID.randomUUID().toString());
        LOG.debug("Saved campaign with ID - {}", campaign.getId());
    }

}

package lukerathbone.playground.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

    private static final Logger LOG = LoggerFactory.getLogger(SendEmail.class);

    public void send(Email email) {
        LOG.debug("Sent email to {}", email.getTo());
    }

}

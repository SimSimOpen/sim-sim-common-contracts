package info.jemsit.common.dto.message;

import com.fasterxml.jackson.annotation.JsonTypeName;
import info.jemsit.common.data.enums.RabbitMQMessages;

@JsonTypeName("MediaFromMobileStarted")
public class MediaFromMobileStarted extends RabbitMQMessage {

    public MediaFromMobileStarted(String id, RabbitMQMessages message) {
        super(id, message);
    }

    protected MediaFromMobileStarted() {
        super(null, null); // ✅ Jackson needs this
    }
}

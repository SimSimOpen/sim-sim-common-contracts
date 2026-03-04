package info.jemsit.common.dto.message;

import com.fasterxml.jackson.annotation.JsonTypeName;
import info.jemsit.common.data.enums.RabbitMQMessages;

@JsonTypeName("MediaUploaded")
public class MediaUploaded extends RabbitMQMessage{
    public MediaUploaded(String id, RabbitMQMessages message) {
        super(id, message);
    }

    public MediaUploaded() {
        super(null, null);
    }
}

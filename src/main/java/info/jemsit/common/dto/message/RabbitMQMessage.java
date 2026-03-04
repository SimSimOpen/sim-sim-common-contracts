package info.jemsit.common.dto.message;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import info.jemsit.common.data.enums.RabbitMQMessages;
import lombok.Getter;

@Getter
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@type")
public abstract class RabbitMQMessage {
    private  String id;
    private  RabbitMQMessages message;

    public RabbitMQMessage(String id, RabbitMQMessages message) {
        this.id = id;
        this.message = message;
    }

    public String getMessageString(){
        return message.getMessage();
    }
}

package info.jemsit.common.data.enums;

public enum RabbitMQMessages {
    MOBILE_SESSION_STARTED("Mobile session started"),
    MEDIA_UPLOADED("Media uploaded");

    private final String message;

    RabbitMQMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

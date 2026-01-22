package info.jemsit.common.dto.request.product;

import java.math.BigDecimal;

public record ResidentRequestDTO(
        Long id,
        String title,
        String country,
        String region,
        String city,
        String district,
        String address,
        Double description,
        BigDecimal price,
        Integer numberOfRooms,
        Double area,
        Boolean isForRent,
        String ownerContact,
        String publish
) {
}

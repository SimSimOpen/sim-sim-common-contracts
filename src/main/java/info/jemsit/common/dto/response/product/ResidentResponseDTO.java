package info.jemsit.common.dto.response.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ResidentResponseDTO(
        String title,
        String country,
        String region,
        String city,
        String district,
        String address,
        String description,
        BigDecimal price,
        String category,
        Boolean ForSale,
        String ownerContact,
        String publish,
        Long id,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long agentId
) {
}

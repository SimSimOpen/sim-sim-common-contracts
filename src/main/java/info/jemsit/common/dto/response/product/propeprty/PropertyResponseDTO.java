package info.jemsit.common.dto.response.product.propeprty;

import info.jemsit.common.data.enums.property.*;
import info.jemsit.common.dto.request.product.property.PropertyLocation;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record PropertyResponseDTO(
        Long id,
        String title,
        Double description,
        BigDecimal price,
        Integer numberOfRooms,
        Double area,
        String publish,

        PropertyCategory category,
        PropertyType type,
        OfferType offerType,
        ListingStatus listingStatus,
        OccupancyStatus occupancyStatus,

        String ownerContact,
        String agent,
        Long agentID,
        PropertyLocation location,
        List<PropertyMedia> medias,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}

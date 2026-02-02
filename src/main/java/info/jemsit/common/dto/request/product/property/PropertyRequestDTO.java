package info.jemsit.common.dto.request.product.property;

import info.jemsit.common.data.enums.property.*;

import java.math.BigDecimal;

public record PropertyRequestDTO(
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
        PropertyLocation location
        ) {
}

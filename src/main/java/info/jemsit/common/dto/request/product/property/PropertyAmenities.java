package info.jemsit.common.dto.request.product.property;

public record PropertyAmenities (
        Boolean hasParking,
        Boolean hasGarden,
        Boolean hasSwimmingPool,
        Boolean hasGym,
        Boolean hasSecurity,
        Boolean hasElevator
){
}

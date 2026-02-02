package info.jemsit.common.dto.request.product.property;

public record PropertyLocation (
         String mapLocation,
         String country,
         String region,
         String city,
         String district,
         String address
) {
}

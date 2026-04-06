package info.jemsit.common.dto.response.product.propeprty;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PropertiesStats(@JsonProperty("total_count") long totalCount,
                              @JsonProperty("active_count") long activeCount,
                              @JsonProperty("rented_count") long rentedCount,
                              @JsonProperty("draft_count") long draftCount) {
}

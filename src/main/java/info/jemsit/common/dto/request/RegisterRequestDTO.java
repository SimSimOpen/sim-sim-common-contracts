package info.jemsit.common.dto.request;

import info.jemsit.common.annotations.ValidPassword;
import jakarta.validation.constraints.Email;

public record RegisterRequestDTO(
        String username,
        @ValidPassword
        String password,
        @Email
        String email,
        String agencyName,
        String licenseNumber
) {
}

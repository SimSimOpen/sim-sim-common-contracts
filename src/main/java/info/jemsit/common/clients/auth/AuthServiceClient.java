package info.jemsit.common.clients.auth;

import info.jemsit.common.clients.FeignAuthInterceptor;
import info.jemsit.common.dto.response.auth.UserDetailsResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "auth-service", path = "/api/auth", configuration = FeignAuthInterceptor.class)
public interface AuthServiceClient {

    @GetMapping("/v1/details")
    UserDetailsResponseDTO getUserDetails();
}

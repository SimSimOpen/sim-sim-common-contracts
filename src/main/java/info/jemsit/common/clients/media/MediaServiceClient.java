package info.jemsit.common.clients.media;

import info.jemsit.common.clients.FeignAuthInterceptor;
import info.jemsit.common.dto.response.media.UploadImagesResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "media-service", path = "/api/media", configuration = FeignAuthInterceptor.class)
public interface MediaServiceClient {
    @PostMapping("/v1/upload")
    UploadImagesResponseDTO uploadMedia(@RequestParam(value = "property_id", required = false) Long property_id, @RequestPart("files") List<MultipartFile> files);
}

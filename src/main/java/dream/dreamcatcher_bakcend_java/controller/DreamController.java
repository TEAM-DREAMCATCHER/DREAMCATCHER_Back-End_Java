package dream.dreamcatcher_bakcend_java.controller;

import dream.dreamcatcher_bakcend_java.model.Dreams;
import dream.dreamcatcher_bakcend_java.service.DreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DreamController {

    private final DreamService dreamService;

    @PostMapping("/api/dream/upload")
    public Dreams dreamInsert(@RequestBody Dreams dreams) {
        return dreamService.dreamInsert(dreams);
    }
}

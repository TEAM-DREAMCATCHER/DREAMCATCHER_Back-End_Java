package dream.dreamcatcher_bakcend_java.service;

import dream.dreamcatcher_bakcend_java.model.Dreams;
import dream.dreamcatcher_bakcend_java.repository.DreamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DreamService {
    private final DreamRepository dreamRepository;

    public Dreams dreamInsert(Dreams dreams) {
        dreamRepository.save(dreams);
        return dreams;
    }
}

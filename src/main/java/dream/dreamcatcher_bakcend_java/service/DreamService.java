package dream.dreamcatcher_bakcend_java.service;

import dream.dreamcatcher_bakcend_java.model.Dream;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DreamService {
    private final MongoTemplate mongoTemplate;

    public Dream dreamInsert(Dream dream) {
        mongoTemplate.insert(dream);
        return dream;
    }
}

package dream.dreamcatcher_bakcend_java.repository;

import dream.dreamcatcher_bakcend_java.model.Dreams;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DreamRepository extends MongoRepository<Dreams, Long> {
}

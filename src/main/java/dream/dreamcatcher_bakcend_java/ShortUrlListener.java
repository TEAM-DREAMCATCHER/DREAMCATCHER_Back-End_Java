package dream.dreamcatcher_bakcend_java;

import dream.dreamcatcher_bakcend_java.model.Dreams;
import dream.dreamcatcher_bakcend_java.service.SequenceGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ShortUrlListener extends AbstractMongoEventListener<Dreams> {

    private final SequenceGeneratorService generatorService;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Dreams> event) {
        event.getSource().setId(generatorService.generateSequence(Dreams.SEQUENCE_NAME));
    }
}

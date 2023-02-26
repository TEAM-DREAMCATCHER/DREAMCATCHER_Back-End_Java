package dream.dreamcatcher_bakcend_java.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class AutoSequence {

    @Id
    private String id;
    private Long seq;
}

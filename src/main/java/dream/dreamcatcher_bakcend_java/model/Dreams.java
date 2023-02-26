package dream.dreamcatcher_bakcend_java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
@Entity
public class Dreams {
    @Transient
    public static final String SEQUENCE_NAME = "dream_sequence";

    @Id
    private Long id;
    private String userId;
    private String content;
    private LocalDate createdAt = LocalDate.now();
    private LocalDate updatedAt = LocalDate.now();
    private int likeCount;
    private String category;
    private boolean pri;
    private String emoji;
}

package angiprestano.workBlog.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalTime;

@Getter
@Setter
@ToString

public class BlogPost {
    private int id;
    private String categories;
    private String title;
    private String cover;
    private String content;
    private LocalTime minutes;
}

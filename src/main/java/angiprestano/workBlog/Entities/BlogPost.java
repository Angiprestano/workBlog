package angiprestano.workBlog.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalTime;

@Entity
@Table(name = "blog_posters")
@Getter
@Setter
@ToString
public class BlogPost {
    private int id;
    private Categories categories;
    private String title;
    private String cover;
    private String content;
    private int minutes;
}

package angiprestano.workBlog.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Authors {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateofbirth;
    private String avatar;
}

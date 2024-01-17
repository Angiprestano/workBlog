package angiprestano.workBlog.repository;

import angiprestano.workBlog.Entities.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AuthorsDAO extends JpaRepository<Authors, Integer> {
    Optional<Authors> findByEmail (String email);
}

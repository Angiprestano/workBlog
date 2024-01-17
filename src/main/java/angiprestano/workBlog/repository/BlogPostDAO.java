package angiprestano.workBlog.repository;

import angiprestano.workBlog.Entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostDAO extends JpaRepository<BlogPost, Integer> {
}

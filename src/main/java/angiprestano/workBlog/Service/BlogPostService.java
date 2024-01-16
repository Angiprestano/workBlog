package angiprestano.workBlog.Service;

import angiprestano.workBlog.Entities.Authors;
import angiprestano.workBlog.Entities.BlogPost;
import angiprestano.workBlog.Exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

        private List<BlogPost> BlogPost = new ArrayList<>();

        public List<BlogPost> getAuthor() {
            return this.BlogPost;
        }

        //SECOND METHOD
        public BlogPost save(BlogPost body) {
            Random rndm = new Random();
            body.setId(rndm.nextInt(1, 1000));
            this.BlogPost.add(body);
            return body;
        }

        public BlogPost findById(int id) {
            BlogPost found = null;
            for (BlogPost blogPost : this.BlogPost) {
                if (blogPost.getId() == id) {
                    found = blogPost;
                }
            }
            if (found == null)
                throw new NotFoundException(id);
            return found;
        }

        public BlogPost findByIdAndUpdate(int id, BlogPost body) {
            BlogPost found = null;
            for (BlogPost blogPost : this.BlogPost) {
                if (blogPost.getId() == id) {
                    found = blogPost;
                    found.setId(id);
                    found.setCategories(body.getCategories());
                    found.setTitle(body.getTitle());
                    found.setContent(body.getContent());
                    found.setMinutes(body.getMinutes());
                    found.setCover(body.getCover());
                }
            }
            if (found == null)
                throw new NotFoundException(id);
            return found;
        }
        public void findByIdAndDelete(int id) {
            Iterator<BlogPost> iterator = this.BlogPost.iterator();
            while (iterator.hasNext()) {
               BlogPost current = iterator.next();
                if (current.getId() == id) {
                    iterator.remove();
                }
            }
        }
    }

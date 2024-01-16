package angiprestano.workBlog.Service;

import angiprestano.workBlog.Entities.Authors;
import angiprestano.workBlog.Entities.BlogPost;
import angiprestano.workBlog.Exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AuthorsService {
    private List<Authors> authors = new ArrayList<>();

    public List<Authors> getAuthor() {
        return this.authors;
    }

    //SECOND METHOD
    public Authors save(Authors body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 1000));
        this.authors.add(body);
        return body;
    }

    public Authors findById(int id) {
        Authors found = null;
        for (Authors authors : this.authors) {
            if (authors.getId() == id) {
                found = authors;
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }

    public Authors findByIdAndUpdate(int id, Authors body) {
        Authors found = null;
        for (Authors authors : this.authors) {
            if (authors.getId() == id) {
                found = authors;
                found.setId(id);
                found.setName(body.getName());
                found.setSurname(body.getSurname());
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }
    public void findByIdAndDelete(int id) {
        Iterator<Authors> iterator = this.authors.iterator();
        while (iterator.hasNext()) {
            Authors current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }
}


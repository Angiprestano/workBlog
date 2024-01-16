package angiprestano.workBlog.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1.GET: http://localhost:3001/authors
//2.GET: http://localhost:3001/authors/:id
//3.POST: http://localhost:3001/authors/id (+ body)
//4.PUT: http://localhost:3001/authors/:id (+body)
//5.DELETE: http://localhost:3001/authors/:id
@RestController
@RequestMapping("/authors/")
public class AuthorsController {

}

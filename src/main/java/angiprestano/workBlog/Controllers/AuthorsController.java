package angiprestano.workBlog.Controllers;

import angiprestano.workBlog.Entities.Authors;
import angiprestano.workBlog.Service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//1.GET: http://localhost:3001/authors
//2.GET: http://localhost:3001/authors/:id
//3.POST: http://localhost:3001/authors/id (+ body)
//4.PUT: http://localhost:3001/authors/:id (+body)
//5.DELETE: http://localhost:3001/authors/:id

@RestController
@RequestMapping("/authors/")
public class AuthorsController {
@Autowired
    private AuthorsService authorsService;
@GetMapping
    public List<Authors> getAuthors() {
    return authorsService.getAuthors();
}
@GetMapping("/{id}")
public Authors findById(@PathVariable int id) {
    return authorsService.findById(id);
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public Authors saveAuthors(@RequestBody Authors body) {
    return authorsService.save(body);
}
@PutMapping("/{id")
    public Authors findByAndUpdate(@PathVariable int id, @RequestBody Authors body) {
    return this.authorsService.findByIdAndUpdate(id, body);
}
@DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable int id) {
    this.authorsService.findByIdAndUpdate(id);
}
}

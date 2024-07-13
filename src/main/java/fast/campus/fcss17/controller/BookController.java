package fast.campus.fcss17.controller;

import fast.campus.fcss17.domain.Employee;
import fast.campus.fcss17.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/api/v1/book/{name}")
    public Employee getBook(@PathVariable String name) {
        return bookService.getBooks(name);
    }
}

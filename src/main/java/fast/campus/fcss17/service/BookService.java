package fast.campus.fcss17.service;

import fast.campus.fcss17.domain.Employee;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private Map<String, Employee> records = Map.of(
            "danny.kim", new Employee("Danny Kim", List.of("book 1"), List.of("product owner")),
            "steve.kim", new Employee("Steve Kim", List.of("book 2"), List.of("engineer"))
    );

    @PostAuthorize("returnObject.roles.contains('engineer')")
    public Employee getBooks(String name) {
        return records.get(name);
    }
}

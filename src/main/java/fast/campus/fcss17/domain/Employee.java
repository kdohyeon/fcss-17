package fast.campus.fcss17.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Employee {
    private final String name;
    private final List<String> books;
    private final List<String> roles;

    public Employee(String name, List<String> books, List<String> roles) {
        this.name = name;
        this.books = books;
        this.roles = roles;
    }
}
